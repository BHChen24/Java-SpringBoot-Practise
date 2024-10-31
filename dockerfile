
FROM mysql:latest

COPY database_dump.sql /docker-entrypoint-initdb.d/

# default settings
ENV MYSQL_ROOT_PASSWORD=123456