# Spring Flyway Demo

This project demonstrates how to apply Flyway migrations to MySQL database, with a Spring Boot application.

## Environment

- Spring Boot 2.7.2
- Java 17
- Flyway
- Spring Data JPA
- MySQL 8.0.29

## How it's done

Flyway creates `flyway_schema_history` table _on startup_ (of Spring application).

As you create more migration files starting with prefix `V`, the application will apply those migrations on startup.

Flyway allows naming with flexible strategy as long as you don't violate [the migration file naming rules](https://flywaydb.org/documentation/concepts/migrations#naming).

The version naming strategy used here is `yyyy.MM.dd.hh.mm.ss`. (e.g., `V2022.07.29.03.00.00__init.sql`)

The migration files are located in [`resources/db/migration`](https://github.com/litsynp/spring-flyway-demo/tree/main/src/main/resources/db/migration).

The result is like this:

- `flyway_schema_history`
  ![flyway_schema_history-result](https://user-images.githubusercontent.com/42485462/181580994-12c6c35e-2b6a-46e8-ae96-db2011ddd6be.png)

As you can see, the migration files are tracked in `flyway_schema_history`, with the versions and descriptions.

The review data in [`V2022.07.29.03.30.00__init_reviews.sql`](https://github.com/litsynp/spring-flyway-demo/blob/main/src/main/resources/db/migration/V2022.07.29.03.30.00__init_reviews.sql) are also successfully initialized.

- `review-table-result`
  ![review-table-result](https://user-images.githubusercontent.com/42485462/181581003-4ff7e67e-4263-40e4-a4be-afa31ea7d4c6.png)

## API

There is **only one API** available: review list API.

- `GET http://localhost:8080/api/v1/reviews`

## How to run

1. Run the MySQL database server.
    ```bash
    $ docker compose up 
    ```

2. Close the MySQL server when you're done. (remove `-v` flag to preserve the data on next launch)
    ```bash
    $ docker compose down -v
    ```
