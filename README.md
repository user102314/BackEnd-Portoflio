"# BackEnd-Portoflio" 
J'ai compris. Voici le contenu structuré pour le fichier README.md de votre projet Backend Spring Boot (API des messages et des avis), prêt à être copié et adapté.Ce README couvre les aspects essentiels : configuration, installation, exécution, et API endpoints.🚀 Backend API - Mon PortfolioCe projet est le backend de mon portfolio personnel, développé en Java 21 avec le framework Spring Boot 3.x. Il fournit les services API nécessaires au fonctionnement du frontend React, notamment la gestion des messages de contact et la modération des avis/témoignages.🛠 Technologies UtiliséesLangage : Java 21Framework : Spring Boot 3.xBase de données : MySQL (via JPA/Hibernate)Dépendances clés : Spring Web, Spring Data JPA, Validation, Lombok.⚙️ Configuration du Projet1. PrérequisJDK 21 ou supérieur.Maven (pour la gestion des dépendances et la construction).Une instance MySQL ou MariaDB.2. Configuration de la Base de DonnéesModifiez le fichier de configuration principal src/main/resources/application.properties (ou application.yml) avec vos identifiants de base de données.Properties# Configuration du serveur
server.port=9090

# Configuration de la base de données MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/mon_portfolio_db
spring.datasource.username=VOTRE_UTILISATEUR_MYSQL
spring.datasource.password=VOTRE_MOT_DE_PASSE
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Configuration CORS (doit correspondre à l'URL de votre frontend)
# Assurez-vous que cette liste inclut le port de votre application React (ex: 3000, 5173, 8081)
allowed.origins=http://localhost:5173,http://localhost:3000,https://[VOTRE_NOM_DE_DOMAINE_DE_PROD]
▶️ Démarrage de l'ApplicationVia Maven (ligne de commande)Assurez-vous d'être à la racine du projet backend.Construisez le projet :Bashmvn clean install
Exécutez l'application (le port par défaut est 9090) :Bashjava -jar target/*.jar
Via IDE (IntelliJ, VS Code, etc.)Ouvrez le projet.Exécutez la méthode main dans la classe principale [VotreNomApplication]Application.java.L'API sera disponible à l'adresse : http://localhost:9090.📚 API EndpointsLes deux principaux contrôleurs gèrent les messages de contact et les avis clients.1. Messages de Contact (/api/messages)MéthodeEndpointDescriptionFrontend qui ConsommePOST/api/messagesEnregistre un nouveau message de contact envoyé via le formulaire.Contact.tsxCorps de la Requête POST (JSON) :JSON{
    "nom": "Jane Doe",
    "email": "jane@example.com",
    "sujet": "Proposition de projet",
    "contenu": "J'aimerais discuter d'une collaboration..."
}
2. Avis et Témoignages (/api/avis)MéthodeEndpointDescriptionFrontend qui ConsommeGET/api/avisRécupère tous les avis approuvés (approuve = true) pour l'affichage public.Avis.tsxPOST/api/avisSoumet un nouvel avis. L'avis est enregistré avec approuve = false (en attente de modération).Avis.tsxCorps de la Requête POST (JSON) :JSON{
    "nomClient": "Marc Tremblay",
    "entreprise": "Tech Innov",
    "commentaire": "Service rapide et professionnel !",
    "note": 5
}
🚨 Note Importante sur la ModérationPour que les avis apparaissent sur le portfolio, ils doivent être marqués comme approuve = true dans la base de données.Connectez-vous à votre base de données.Modifiez le champ approuve dans la table avis pour les témoignages que vous souhaitez rendre publics.🤝 Contribution et SupportSi vous trouvez des bugs ou souhaitez proposer des améliorations :Clonez le dépôt.Créez une nouvelle branche pour vos modifications.Soumettez une Pull Request.
