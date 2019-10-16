package co.grandcircus.jdbcintro.dao;

import java.util.List;

import co.grandcircus.jdbcintro.entity.Room;

// DAO stands for Data Access Object.
// DAOs are used as a layer of code that is responsible for communicating
// with the database. On the Java side, we use the Room POJO with properties.
// On the SQL side, there are corresponding rows and columns.
// The @Repository annotation tells Spring both that this is a component
// (a.k.a Spring Bean) that can be autowired and that it should be treated like
// a DAO (which mostly applies to error handling behind the scenes).

public class RoomsDao {
	
	// Spring will automatically inject this dependency thanks to @Autowired
	

	public List<Room> findAll() {
		// BeanPropertyRowMapper uses the rows from the SQL result create
		// new Room objects and fill in the values by calling the setters.
		// Use .query for SQL SELECT statements.
		return null;
	}
	
	public Room findById(Long id) {
		// The last parameters of .query let us specify values for the (?) parameters in our SQL statement.
		// While .query returns a list, .queryForObject assumes only one result. 
		// If nothing matched, match will be null.
		return null;
	}
	
	public void update(Room room) {
		// Use .update for SQL INSERT, UPDATE, and DELETE
		// All the parameters after the first specify values to fill in the ?s in the SQL.
		
	}
	
	public void create(Room room) {
		
	}
	
	public void delete(Long id) {
		
	}
}
