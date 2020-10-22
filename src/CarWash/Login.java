package CarWash;

import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);

    public void adminLogin() {
        System.out.println("Type amin password: ");

        String adminPassword = "1234";

        while (true) {
            String typePassword = scanner.nextLine();
            if (typePassword.equals(adminPassword)) {
                System.out.println("Password correct!");
                break;
            } else {
                System.out.println("Incorrect password, try again.");
            }
        }
    }
}