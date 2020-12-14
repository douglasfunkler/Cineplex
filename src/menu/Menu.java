package menu;

import dao.DAO;

public class Menu {

	public static void main(String[] args) {

		System.out.println("Welcome to the Movie List Application");
		DAO dao = new DAO();
		dao.testConnection();

		System.out.println("1) Sign in or 2) Sign up: ");
		String s = "y";
		int choice = 0;
		while (s.equalsIgnoreCase("y")) {
			switch (choice) {
			case 1:
				dao.consult();
			case 2:
				dao.insert();
			}
		}
	}
}
