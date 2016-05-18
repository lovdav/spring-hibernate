Proyecto que crea una conexión con base de datos de mysql
Utiliza Spring 4.0.3 con hibernate 3.6.9
Es compuesto por pruebas unitarias de Spring, realiza mapeo a traves de anotaciones,
por lo cual utiliza la clase org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean
para crear el sessionFactory

No realiza Transacciones como Spring lo sugiere
En vez de eso abre una transacción y realiza commit.

Realiza @Autowire desde el test
