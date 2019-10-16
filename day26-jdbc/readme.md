## JDBC
* JDBC: Java Database Connectivity - Java library that allows Java code to connect with any relational database (a.k.a. SQL database)
* Database Driver: translator between JDBC and the specific database (e.g. MySQL, Oracle)
* How to specify MySQL driver JAR? pom.xml &lt;dependencies&gt;
* application.properties - tell spring how to connect to our DB
* DAO (Data Access Object) - responsible for directly communicating with your database. it's a singleton. Use @Repository annotation.
* How does the controller get access to the DAO? `@Autowired MyDao myDao;`
* CRUD: Create, Read, Update, Delete
* JdbcTemplate methods:
  * query - returns a List
  * queryForObject - returns a single result
  * update - used for INSERT, UPDATE, and DELETE
* BeanPropertyRowMapper is used to translate database rows to Java beans. The column names and property names must match exactly.
* We use "?"s in our SQL, provide placeholders that we fill in with corresponding values in the jdbcTemplate method call. The order of the ?s matches the order of the arguments.



