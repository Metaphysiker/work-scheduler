### Who do I talk to? ###

* Sandro Räss (sandro.raess@realms.ch)

### How to develop? ###

Install npm packages:

    docker compose run npm sh
    cd vue-app
    npm install my_package --save

### How to start app? (development) ###

For the first time, create an .env - file with this command:

    cp .example.env .env

Then run:

    docker compose up

Visit http://localhost:8080/ .
