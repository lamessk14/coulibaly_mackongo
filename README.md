######################### DESCRIPTION GENERALE DU PROJET ################################

Le but de ce projet est de réaliser une petite application qui manipule une base de données NoSQL (MongoDB dans notre cas). Il est également question de manipuler REDIS.

########################## INSTALLATION DU PROJET ######################################## 
Pour faire fonctionner le projet, il faut:

- Importer le projet en tant que projet Maven après l'avoir téléchargé
- Ouvrir MongoDB (D'abord mongod.exe puis mongo.exe)
- Exécuter le projet en tant que projet Maven et mettre dans goal: site
- Exécuter la classe App

######################## LIMITES D'UNE BASE DE DONNEES ORIENTEE DOCUMENTS ######################
- Problèmes d'efficacité lorsque l'on souhaite manipuler toutes les tuples de la base de données
- Modèle de requête est limité aux clés et aux index
- Inappropriée pour des données interconnectées tels que des graphes
- Modèle de données relativement consistent

#################### TYPE DE DONNEES STOCKEES DANS REDIS ###############
Les différents types de données présents dans REDIS sont: les chaînes de caractères, les listes, les sets, les sets triés/ordonnés, les maps (hashs) qui sont un ensemble de couples clé-valeur, des bitmaps (tableau de bits) et des hyperLogLogs

################ TYPE DE REQUETES POUVANT ETRE REALISEES AVEC REDIS ##########
Il n'est pas réellement possible de réaliser des requêtes sur REDIS. Il existe toutefois un ensemble de commandes pouvant être réalisé selon le type de données manipulé.
Par exemple, HDEL permet de supprimer un/plusieurs champs d'une hash
LINSERT permet d'insérer un élément dans une liste
