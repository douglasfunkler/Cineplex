package user;

import java.sql.*;
import java.util.Scanner;

//This class was designed to create an user or validate an existing one
public class User {

    //This method logs in an user and returns a boolean value
    public Boolean login() {

        //SQL instructions to MYySQL Driver
        String sql = "SELECT * FROM USER";
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String usernamedb = "root";
        String passworddb = "root@root";

        Scanner scanner = new Scanner(System.in);

        //Interacts with the user requesting info
        System.out.println("Type the username: ");
        String usernameInput = scanner.nextLine();
        System.out.println("Type the password: ");
        String passwordInput = scanner.nextLine();

        //Holds the data retrieved from database
        String username;
        String password;
        boolean userOk = true;

        //Executes the connection and try to retrieve data
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbURL, usernamedb, passworddb);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                username = result.getString(2);
                password = result.getString(3);

                //Broken code trying to compare the data provided by the user with the ones retrieved from the database
                if (usernameInput.contentEquals(username) && passwordInput.contains(password)) {
                    userOk = true;
                } else {
                    userOk = false;
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Returns a valid or false login
        return userOk;
    }

    //This method creates an user and returns a boolean value
    public Boolean signUp() {

        //SQL instructions to MYySQL Driver
        String sql = "INSERT INTO CUSTOMER (name, dob, membershipcard, card, email) VALUES (?, ?, ?, ?, ?)";
        String dbURL = "jdbc:mysql://localhost:3306/cineplex";
        String usernamedb = "root";
        String passworddb = "root@root";

        Scanner scanner = new Scanner(System.in);
        //Interacts with the user requesting info
        String usernameInput = scanner.nextLine();
        String passwordInput = scanner.nextLine();

        //Holds data retrieved from the database
        String username = null;
        String password = null;

        boolean done = false;

        //Executes the connection and try to insert data
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbURL, usernamedb, passworddb);
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(2, usernameInput);
            statement.setString(3, passwordInput);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                done = true;
                System.out.println("A new user was inserted successfully!");
            } else {
                done = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Returns a boolean value signalizing a valid or false response
        return done;
    }
}
