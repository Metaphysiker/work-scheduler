### Who do I talk to? ###

* Sandro Räss (sandro.raess@realms.ch)

### How to develop in vue? ###

Install npm packages:

    docker compose run npm sh
    cd vue-app
    npm install my_package --save

### How to develop in spring? ###

If you don't already have a mongodb, set one up that listens to 27017.

In application.properties, switch uri:

    #spring.data.mongodb.uri=mongodb://${MONGO_INITDB_ROOT_USERNAME}:${MONGO_INITDB_ROOT_PASSWORD}@mongodb/springapp?authSource=admin
    spring.data.mongodb.uri=mongodb://localhost:27017/springapp // <--- enable this

### How to start app? (development) ###

For the first time, create an .env - file with this command:

    cp .example.env .env

Then run:

    docker compose up

Visit http://localhost:8080/ .
