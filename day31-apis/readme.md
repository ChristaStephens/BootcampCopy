## Web APIs
* API - application programming interface: defines the correct way for a developer to write a program that interfaces with a particular system. In our case we will be accessing APIs on the web, which define particular HTTP requests and responses.
* JSON - JavaScript Object Notation: a textual format for data that is easily read by computers and humans
* XML - another HTML-like format for data
* RestTemplate - Spring feature for using RESTful APIs.
* API Key - Unique key given by API provider when you sign up. Usually passed with every API request.
* REST - Loose standard for web services. Uses HTTP protocol. Generally defines the URLs, methods, parameters, headers and responses.
  - Uses HTTP protocol
  - URL Path - what thing (noun)
  - Method - what to do (action, verb)
* RESTful CRUD
  - Create: POST /products
  - Read All: GET /products
  - Read One: GET /products/8
  - Update: PUT /products/8
  - Delete: DELETE /products/8
* Request
  - Method
  - URL (includes parameters)
  - Headers
  - Body
* Response
  - Status Code
  - Headers
  - Body
* Parts of URL
  - protocol
  - host / domain / IP address
  - port (sometimes)
  - path
  - parameters
  - hash (never sent to server)
* AJAX - Asynchronous JavaScript And XML - Allows JavaScript to transfer data with the server without reloading a page.

## Review
* Maven - a tool for building and running applications. It is particularly useful for dependency management, i.e. downloading all the JARs.
* Transactions - Multiple SQL commands will all complete or all fail together. Nothing will be left half-done.
* Joins - aligning two SQL tables together into one result. Use foreign keys to match up rows. (inner, left, right, outer)
* Dependency Injection - Spring provides your classes with access to instances of other classes. For example in your controller, Spring autowires your DAO.
* JDBC - Provides a uniform way to run SQL queries from your Java application. There are Drivers to make it work with many different relational databases.
* ORM - Object Relational Mapping - Provides a way to automatically manage the database by manipulating Java Objects. The Java Classes are typically mapped to SQL tables.













