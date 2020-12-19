package menu;

import java.util.Arrays;
import java.util.Scanner;

import dao.DAO;
import movies.MovieList;
import user.User;

public class Cineplex {

    public static void main(String[] args) {

        System.out.println("Welcome to Cineplex");

        DAO dao = new DAO();
        dao.testConnection();
        new Cineplex();
    }

    public Cineplex() {
        //checkUser();
        menu();
    }

    //This method will be the first interaction with the user to check if it is necessary to register or just login
    public void checkUser() {
        String s = "y";
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Sign in or 2) Sign up: ");

        int choice = sc.nextInt();
        User user = new User();
        switch (choice) {
            case 1:
                //Calls the boolean method on the User class
                boolean validLogin = user.login();
                //If valid, goes to the main menu
                if (validLogin) {
                    menu();
                } else {
                    //If the user doesn't exist, call itself again recursively and try again
                    checkUser();
                }
                break;
            case 2:
                //Calls the boolean method to create an user
                user.signUp();
                //Goes to the main menu
                menu();
                break;
            case 3:
                System.exit(0);
        }
    }

    //Menu for the user to interact with
    public void menu() {

        //Retrieves the full list of movies available on catalog
        MovieList ml = new MovieList();
        for (String list : ml.MovieList()) {
            System.out.println(list);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a movie: ");
        String choice = scanner.nextLine();
        System.out.println("Movie has been selected!");

        //From this part on, it is just an illustration of the kind of course the application will take as this is not implementend yet
        if ("User has privileges" == "Discounted price") {
            System.out.println("Discount applied");
            System.out.println("10 points accumulated");
            System.out.println("Enjoy the movie!");
        } else {
            System.out.println("10 points accumulated");
            System.out.println("Enjoy the movie!");
        }
    }
}

