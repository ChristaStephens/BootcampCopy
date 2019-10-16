### Spring
@Component - to register a singleton Spring Bean (Alternatively you can use @Service)

@Autowired - have Spring insert a registered Spring Bean. This is called *dependency injection*. Spring assigns the value to any variable that has the @Autowired annotation.

### Spring MVC
You can have optional request parameters.
```
@RequestParam(value="category", required=false) String category
```

### GET vs POST
This is called the request *method*.

| Method | How it Works | Pros |
| ------ | ------------ | ---- |
| GET | parameters in URL | Linkable. Bookmarkable. Can refresh. |
| POST | parameters in body | Not easily visible or changeable. Warn if resubmit. No limit to size of values (even file upload).

### JSTL - Java Standard Tag Library
Include near top of file
```
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
```

For Each - like `for (Food food : foods) { ... }`
```
<c:forEach var="food" items="foods">
```

If
```
<c:if test="${ not empty cat }">
```

### JSP Expression Language
${ food }
${ food.name } - actually calls food.getName()

To set the value of an input on page load use value="${ something }"

Boolean expressions

* `${ empty x }` - x is null or empty string, array, or collection
* `${ not empty x }` - x is not null or empty string, array, or collection
* `${ x eq 'hello' }`
* `${ x gt 4 }`
* `${ x lt 4 }`
* `${ x le 4 }` - <=
* `${ x ne 17 }` - !=

### HTML5 Validation
* required
* minlength="2"
* maxlength="10"
* pattern="[A-Z][a-z]*" - use a regular expression
* type="email"
* type="number"
* min="1"
* max="200"
* step="1" - has to be a whole number

### Bootstrap
##### Setup
1. https://getbootstrap.com
2. Add their css link OR copy their entire HTML starter template. Make sure to keep the &lt;% %&gt; JSP config lines at the top of your JSP.
3. Include your own CSS link below bootstrap.

##### Implementation
* Add the container element with class="container" around your whole page.
* Add the appropriate classes.
* Use their HTML snippets.