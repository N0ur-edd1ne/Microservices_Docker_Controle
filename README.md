# Microservices_Docker_Controle
Microservices Architecture with Docker using JEE Applications and MySQL Databases

Ce mini-projet vise à créer une application basée sur une architecture de microservices pour la gestion des clients et des voitures. La communication entre les microservices sera facilitée à l'aide de RestTemplate, et les fichiers de configuration au format properties seront remplacés par des fichiers YAML. Dans cette phase initiale, l'accent est mis sur la mise en place du service de découverte Eureka.

Objectif
L'objectif principal de ce mini-projet est de mettre en œuvre une architecture de microservices robuste pour la gestion des entités Client et Car. RestTemplate sera utilisé pour la communication entre les microservices, et les fichiers de configuration seront migrés vers YAML pour une lisibilité et une flexibilité améliorées.

Exécution :
- Démarrer le service Eureka
- Démarrez le service Eureka en exécutant la classe principale de votre projet Eureka.
- Démarrer les clients de microservices
- Lancez les clients de microservices. Ils devraient s'enregistrer automatiquement auprès du service Eureka.
- Vérifier la découverte de service
- Accédez à la console Eureka (http://localhost:{port}/) pour vérifier si les microservices sont correctement enregistrés.
- Effectuez des appels RestTemplate entre les microservices pour vous assurer que la communication fonctionne correctement.

Remarques :
Assurez-vous d'avoir les dépendances appropriées dans le fichier pom.xml pour les projets, telles que spring-cloud-starter-netflix-eureka-server et spring-cloud-starter-netflix-eureka-client.
Utilisez le nom de l'application enregistré dans Eureka dans les appels RestTemplate pour assurer une découverte de service efficace.

Conclusion :
La mise en place du service de découverte Eureka dans cette première partie du mini-projet jette les bases d'une architecture de microservices bien structurée. Les prochaines étapes incluront la mise en œuvre de fonctionnalités spécifiques pour les microservices Client et Car, ainsi que des tests approfondis de l'interaction entre les services.


![Screen 1](https://github.com/N0ur-edd1ne/Microservices_Docker_Controle/assets/117684844/a159b060-102c-417c-98b8-1503b72b12d0)

![Screen 2](https://github.com/N0ur-edd1ne/Microservices_Docker_Controle/assets/117684844/e0341ab8-bac2-47be-bd96-593d96f4caf8)

![Screen 3](https://github.com/N0ur-edd1ne/Microservices_Docker_Controle/assets/117684844/3e0bc07e-de90-484a-8cd1-2e4f94ef361f)
