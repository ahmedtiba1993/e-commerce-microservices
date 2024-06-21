# E-Commerce [Micro Services | Spring boot 3 | Spring Cloud]

## Description
Ce projet e-commerce est construit sur une architecture microservices pour assurer une haute disponibilité, une scalabilité et une flexibilité optimale. Voici les composants et technologies clés utilisés dans ce projet :
- **Serveurs de configuration** : Gestion centralisée des configurations pour tous les microservices.
- **Serveur de découverte (Eureka)**: Enregistrement et découverte automatique des microservices.
- **API Gateway** : Gestion des demandes des clients et routage vers les microservices appropriés.
- **Communication asynchrone avec Kafka** : Mise en œuvre de la communication asynchrone pour améliorer la résilience et la scalabilité.
- **Communication synchrone avec Open Feign et Rest Templates** : Facilitation de la communication interservices.
- **Traçage distribué avec Zipkin et Spring Actuator** : Surveillance et traçage des appels à travers les microservices pour un dépannage efficace.
- **Sécurisation de l'application avec Keycloak** : Gestion des authentifications et des autorisations des utilisateurs.
- **Docker et Doccker Compose** : Mise en place de l'infrastructure et des outils requis avec Docker et Docker Compose : Conteneurisation des microservices pour une mise en place et une gestion simplifiée de l'infrastructure.

## Diagramme
![Diagramme sans nom drawio (2)](https://github.com/ahmedtiba1993/e-commerce-microservices/assets/72476268/2a24b623-1870-448c-bce9-002577c33c3a)

## Conception
![Capture d'écran 2024-06-10 115731](https://github.com/ahmedtiba1993/e-commerce-microservices/assets/72476268/13a0eb63-f01d-4097-82ca-85f37986d8a4)

## Les technologies utilisées sont :
- Spring Boot 3 ( Microservices )
- Docker & Docker Compose
- Keycloak
- Zipkin
- Postgresql 
- MongoDb
- Kafka

## Les étapes de démarrage de projet
- Lancer le fichier Docker Compose avec la commande **docker-compose up -d**
- Accéder à l'interface d'administration de Keycloak : Une fois que Keycloak est démarré, ouvrez votre navigateur et accédez à **http://localhost:9090**
- se connecter à l'interface d'administration avec Nom d'utilisateur : admin Mot de passe : admin
- Ajouter un realm : Cliquez sur le menu déroulant en haut à gauche (qui affiche le realm actuel, par défaut "Master") et sélectionnez "Add realm".
- Remplissez les informations pour le nouveau realm avec Nom : **micro-services** et Cliquez sur Create.
- Ajouter un client au nouveau realm avec le nom **micro-service-api** avec cette configuration
![image](https://github.com/ahmedtiba1993/e-commerce-microservices/assets/72476268/3d0a3b12-14bf-4a0c-a0be-71ac2fcd50b3)
![image](https://github.com/ahmedtiba1993/e-commerce-microservices/assets/72476268/307e2e1e-043b-4a39-af68-7e2a974c97b3)
- Accéder a **Credentials** pour recupéere le client secret
![image](https://github.com/ahmedtiba1993/e-commerce-microservices/assets/72476268/93134bc6-5621-450e-8e1e-c0a75d1255fd)
- Ouvrir Postman et créer une nouvelle requête
- Sélectionner l'onglet Auth : Cliquez sur l'onglet "Authorization". : Type : Dans le menu déroulant "Type", sélectionnez **OAuth 2.0**
- Configurer OAuth 2.0 : Client ID = micro-service-api , Access Token URL :** http://localhost:9090/realms/micro-service/protocol/openid-connect/token**, Client Secret : entrez le secret du client.
![image](https://github.com/ahmedtiba1993/e-commerce-microservices/assets/72476268/810739f9-8f98-44fd-800e-46977457e21d)
- Cliquez sur **Get New Access Token**
- **btenir le jeton d'accès** : Une fenêtre s'ouvrira pour obtenir le jeton d'accès. liquez sur **Request Token** ,Si tout est correct, vous recevrez un jeton d'accès. Cliquez sur **Use Token** pour utiliser ce jeton dans votre requête.
- Tester l'API


## Contact
Pour plus d'informations, veuillez me contacter sur [LinkedIn](https://www.linkedin.com/in/ahmedtiba1993/).
