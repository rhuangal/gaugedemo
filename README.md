## SETUP

### CONNECTION TO H2 Embedded Database 
1) Para ingresar a la base de datos H2 embebida con la app se dee ir a la siguiente direccion:

    http://localhost:8080/h2-console
    
2) En jdbc Url debe decir lo siguiente:

    jdbc:h2:mem:testdb

3) El resto de deja igual y se le da connect.

### CONNECTION TO MySQL Database
1) Remover la dependecia de H2 del archivo pom.xml
2) Agregar la dependencia de MySQL:

        <dependency>
             <groupId>mysql</groupId>
             <artifactId>mysql-connector-java</artifactId>
        </dependency>
        
3) En el archivo "application.properties" agregar los datos de conexion de mysql:

    spring.jpa.hibernate.ddl-auto=create
    spring.datasource.url=jdbc:mysql://localhost:3306/<databaseName>
    spring.datasource.username=root
    spring.datasource.password=password
    