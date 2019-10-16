package co.grandcircus.jdbcintro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.grandcircus.jdbcintro.entity.Room;

@Component
public class RoomsDaoOld {
	
	public List<Room> findAll() {
		try (Connection conn = getDBConnection()) {
			String query = "SELECT * FROM Room";
			// Step 3: create statement
			PreparedStatement st = conn.prepareStatement(query);
	
			// Step 4: retrieve results
			ResultSet rs = st.executeQuery();
	
			// Step 5: process results
			ArrayList<Room> list = new ArrayList<>();
			while (rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				Integer capacity = rs.getInt("capacity");
				Boolean available = rs.getBoolean("available");
				list.add(new Room(id, name, capacity, available));
			}
			
			return list;
		} catch(Exception ex) {
			ex.printStackTrace();
			return new ArrayList<>(0);
		}
	}

	private Connection getDBConnection() throws ClassNotFoundException, SQLException {
		// prep for step # 2
		String url = "jdbc:mysql://localhost:3306/db_demos?useSSL=false";
		String userName = "dbuser";
		String password = "password";

		// Step #1: Load and Register Driver
		Class.forName("com.mysql.jdbc.Driver");

		// Step #2: Create Connection
		Connection con = DriverManager.getConnection(url, userName, password);
		return con;
	}
}
