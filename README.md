# ReadCsvFileInMySQLDatabase
Using this spring boot application, you can read the csv file in mysql database with validation on every field

This is an implimentation of spring boot program for reading the data of CSV file into mysql database.


change application.properties file according to your configuration:
spring.datasource.url = jdbc:mysql://localhost:3306/project?useSSL=false (project is the schema name in workbench,you can use any schema name which is present in your local memory) spring.datasource.username = root (username of mysql database) spring.datasource.password = root (password for mysql database) spring.jpa.show-sql = true spring.jpa.properties.hibernate.dialect =org.hibernate.dialect.MySQL5Dialect

spring.jpa.hibernate.ddl-auto=create

Create a csv file in your system having 6 fields (name, id, department, salary, address, email) and upload it in src/main/resources folder.
There is validation check on every field. Plese refer Employee class of model package.
