package com.ahmed.ecommerce.order;

import com.ahmed.ecommerce.customer.CustomerClient;
import com.ahmed.ecommerce.exception.BusinessException;
import com.ahmed.ecommerce.orderline.OrderLineRequest;
import com.ahmed.ecommerce.orderline.OrderLineService;
import com.ahmed.ecommerce.product.PurchaseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.ahmed.ecommerce.product.ProductClient;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderRepository repository;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;

    public Integer createOrder(OrderRequest request) {

        //check customer -- > customer - microService (openFeign)
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No customer exists with the provided ID"));


        // purchase the products -- > product - microService (RestTemplate)
        var purchasedProducts = productClient.purchaseProducts(request.products());

        // persist order
        var order = this.repository.save(mapper.toOrder(request));

        // persist order lines
        for (PurchaseRequest purchaseRequest : request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )
            );
        }

        // todo start paryment process

        // sent the order confirmation -- > notifcation-microService ( kafka )

        return null;
    }
}
