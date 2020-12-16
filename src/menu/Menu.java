package menu;

import java.util.Scanner;

import dao.DAO;

public class Menu {

	public static void main(String[] args) {

		System.out.println("Welcome to the Movie List Application");

		DAO dao = new DAO();
		dao.testConnection();
		String s = "y";
		Scanner sc = new Scanner(System.in);

		System.out.println("1) Sign in or 2) Sign up: ");
		while (s.equalsIgnoreCase("y")) {

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				dao.consult();
				break;
			case 2:
				dao.insert();
				break;
			case 3:
				System.exit(0);
			}
		}
		System.out.print("Continue? y/n): ");
		s = sc.nextLine();
	}
}
