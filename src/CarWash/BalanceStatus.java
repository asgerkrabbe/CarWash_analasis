package CarWash;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BalanceStatus {

    public void balanceReader() throws IOException {
        File balance = new File("WashCardBalance");
        Scanner balanceReader = new Scanner(balance);

        System.out.println("Your current washcard balance is:");
        System.out.println(balanceReader.nextInt()+",-");
        }
}
