# Queues
This is a mock project to learn the rabbitmq way of pushing data between queues, saving it a few times along the way, and maniuplating it.
## What you'll need to run this
- Docker
- java21 jdk
- maven
## Composition:
Pusher recieves data from the /user endpoint, saves it in a mariadb database, pushes it into the queue

Then the Receiver pulls the data off of the queue, manipulates it a little bit, and saves it in a postgres database.

## Why
I needed to re-learn this, and it seemed like a good way of doing it