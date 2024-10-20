# Backend SaheLance

SaheLance is a freelance platform for a startup that allows users to offer or to request services in return for money. Look [here](https://github.com/youcef-gaga/Frontend-for-Freelance-Platform---Sahelance) for the front-end project.

# Technologies

- Java 8+;
- Spring Boot (... +Spring Security);
- ModelMapper;
- Hibernate;
- Spring JPA;
- Liquibase;
- PostgreSQL;
- Mockito + JUnit
- Gradle;
- Docker;
- Git.

# Features

- user login (JWT);
- user logout;
- user registration;
- refresh token;
- view requests/offers;
- insert requests/offers;
- paginated requests/offers;
- picture upload;
- admin: approve post;
- message module: write/read DM between users;
- infinite scrolling in DM;
- microjob status;
- user rating;
- code testing with Mockito;
- ...wip.

# Architecture

![Database](image_2.png)

# Job Instance status flow

![Database](image_1.png)

# Run it

### Download and run docker database image

```bash
sudo docker-compose up -d
```
or
```bash
java -jar build/libs/micro-jobs-server-1.0-SNAPSHOT.jar
```

### Run as spring boot project from your IDE (IntelliJ)

The server will be reachable on port 8080

# Default username and password

```
username: admin
password: Micr@J@bs
```

If you want to get some information, feel free to [contact me](https://www.linkedin.com/in/youcef-bekhouche-3a438032a/).
