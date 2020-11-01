package CarWash;
import java.io.IOException;
import java.util.Scanner;

public class Menuselection {
    Scanner scanner = new Scanner(System.in);
    Wash wash = new Wash();
    WashCardRecharge washCardRecharge = new WashCardRecharge();
    BalanceStatus status = new BalanceStatus();
    Admin login = new Admin();

    public Menuselection() throws IOException {
    }

    public void menu() throws IOException {

        System.out.println("**WELCOME TO THE SUPERSHINE CARWASH!**\n");
        System.out.println("Choose a language from the list via the keypad:");
        System.out.println("Press one for English:");

        int languageChoice = scanner.nextInt();

        if (languageChoice == 1) {
            System.out.println("You chose, English! Well done.");
        }
        System.out.println("Now choose a wash feature from the following options below:");
        System.out.println("1. \tCarwash\n2. \tWashcard recharge");
        System.out.println("3.  check balance\n4. \tAdmin login");


        do {
            int carWashSelection = scanner.nextInt();

            switch (carWashSelection) {
                case 1: {
                    wash.wash();
                    break;
                }
                case 2: {
                    washCardRecharge.recharge();
                    break;
                }
                case 3: {
                    status.balanceReader();
                    break;
                }
                case 4: {
                    login.adminLogin();
                }
                default:
                    System.out.println("Chosen selection does not exist, please try again.");
                    break;
            }
        } while (true);
    }
}