package CarWash;
import java.io.IOException;
import java.util.Scanner;

public class Menuselection {
    Scanner scanner = new Scanner(System.in);
    WashType washType = new WashType();
    Wash wash = new Wash();
    WashCardRecharge washCardRecharge = new WashCardRecharge();
    StopCarWash stopCarWash = new StopCarWash();
    BalanceStatus status = new BalanceStatus();

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
        System.out.println("3.  check balance");

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

        }
    }
}