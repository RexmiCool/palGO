# palGO

# Faire marcher le projet :
- compiler chaque service avec maven : clean et install
- docker-compose up -d --build
- localhost
  => ça marche !

# Rabbitmq
On a tenté de faire marcher les queues, et elles marchent mais uniquement en local, pas sur docker.
On a du faire sans, mais il reste du code correspondant, qui permet d'envoyer un message de incubateur-service à inventaire-service (si les deux services sont lancés en localement)
