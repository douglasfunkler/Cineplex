package dao;

import java.sql.*;

public class DAO {

	public void testConnection() {
		
		String dbURL = "jdbc:mysql://localhost:3306/cineplex";
		String username = "root";
		String password = "funkler";
		
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				System.out.println("Connected Successfully!");
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert() {

		String sql = "INSERT INTO CUSTOMER (name, dob, membershipcard, card, email) VALUES (?, ?, ?, ?, ?)";

		String dbURL = "jdbc:mysql://localhost:3306/cineplex";
		String username = "root";
		String password = "funkler";

		Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Logan");
			statement.setDate(2, java.sql.Date.valueOf("1990-09-04"));
			statement.setString(3, "123456A");
			statement.setString(4, "123456789");
			statement.setString(5, "logan@gmail.com");

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void consult() {

		String sql = "SELECT * FROM CUSTOMER";

		String dbURL = "jdbc:mysql://localhost:3306/cineplex";
		String username = "root";
		String password = "funkler";

		Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			int count = 0;

			while (result.next()) {
				String name = result.getString(2);
				Date dob = result.getDate(3);
				String membershipcard = result.getString(4);
				String card = result.getString(5);
				String email = result.getString(6);

				String output = "User #%d: %s - %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, name, dob, membershipcard, card, email));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update() {

		String sql = "UPDATE Users SET name=?, dob=?, membershipcard=?, card=?, email=? WHERE name=?";

		String dbURL = "jdbc:mysql://localhost:3306/cineplex";
		String username = "root";
		String password = "funkler";

		Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Oswaldo");
			statement.setString(2, "1980/06/02");
			statement.setString(3, "123456B");
			statement.setString(4, "123456");
			statement.setString(4, "oswaldo@gmail.com");

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete() {
		String sql = "DELETE FROM Users WHERE name=?";

		String dbURL = "jdbc:mysql://localhost:3306/cineplex";
		String username = "root";
		String password = "funkler";
		
		Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bill");

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
