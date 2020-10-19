package CarWash;
import java.util.Scanner;

public class Menuselection {
    public int balance = 100;
    public int deposit;
    Scanner scanner = new Scanner(System.in);

    public void menu() {

        System.out.println("**WELCOME TO THE SUPERSHINE CARWASH!**\n");
        System.out.println("Choose a language from the list via the keypad:");
        System.out.println("Press one for English:");
        int languageChoice = scanner.nextInt();

        if (languageChoice == 1) {
            System.out.println("You chose, English! Well done.");
        }
        System.out.println("Now choose a wash feature from the following options below:");
        System.out.println("Press one for \tCarwash\nPress two for \tWashcard recharge");
        System.out.println("Press three for Washcard balance\nPress four for \tCarwash stop");

        int carWashSelection = scanner.nextInt();

        switch (carWashSelection) {
            case 1: {

            }

        }
    }
}

