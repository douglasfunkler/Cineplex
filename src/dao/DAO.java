package dao;

import java.sql.*;

//DAO stands for Data Access Object and this class was designed to serve as a bridge between Java code and a SQL database.
public class DAO {

    //This method is only used to test if the connection to the database is possible and valid. Nothing else...
    public void testConnection() {

        //Parameters being passed to the MySQL driver
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String username = "root";
        String password = "root@root";

        //MySQL's driver receives the parameters and tries to connect to the database
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

    //This method's purpose is to insert data into the database and so far it doesn't interact with the user. Work in progress...
    public void insert() {

        //Parameters being passed to the MySQL driver
        String sql = "INSERT INTO CUSTOMER (name, dob, membershipcard, card, email) VALUES (?, ?, ?, ?, ?)";
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String username = "root";
        String password = "root@root";

        //MySQL's driver receives the parameters and tries to connect to the database
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            //Statements are introducing data to the database if connection successful
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(2, "Logan");
            statement.setDate(3, java.sql.Date.valueOf("1990-09-04"));
            statement.setString(4, "123456A");
            statement.setString(5, "123456789");
            statement.setString(6, "logan@gmail.com");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //This method's purpose is to read data into the database and so far it doesn't interact with the user. Work in progress...
    public void consult() {

        //Parameters being passed to the MySQL driver
        String sql = "SELECT * FROM CUSTOMER";
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String username = "root";
        String password = "root@root";

        //MySQL's driver receives the parameters and tries to connect to the database
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            //Statement will fetch data from the database if connection successful
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

    //This method's purpose is to change data into the database and so far it doesn't interact with the user. Work in progress...
    public void update() {

        //Parameters being passed to the MySQL driver
        String sql = "UPDATE Users SET name=?, dob=?, membershipcard=?, card=?, email=? WHERE name=?";
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String username = "root";
        String password = "root@root";

        //MySQL's driver receives the parameters and tries to connect to the database
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            //Statements are modifying data on the database if connection successful
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(2, "Oswaldo");
            statement.setString(3, "1980/06/02");
            statement.setString(4, "123456B");
            statement.setString(5, "123456");
            statement.setString(6, "oswaldo@gmail.com");

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //This method's purpose is to delete data into the database and so far it doesn't interact with the user. Work in progress...
    public void delete() {

        //Parameters being passed to the MySQL driver
        String sql = "DELETE FROM Users WHERE name=?";
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String username = "root";
        String password = "root@root";

        //MySQL's driver receives the parameters and tries to connect to the database
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            //Statement will delete data from the database if connection successful
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "");

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
