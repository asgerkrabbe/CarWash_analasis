package CarWash;

import java.io.*;
import java.util.Scanner;

public class WashCardRecharge  {

    FileWriter balanceWriter = new FileWriter("WashCardBalance",true);
    Scanner scanner = new Scanner(System.in);

    public WashCardRecharge() throws IOException {
    }

    public void recharge () throws IOException {
        File balance = new File("WashCardBalance");
        Scanner balanceReader = new Scanner(balance);
        Scanner newBalanceReader = new Scanner(balance);

        int currentBalance = balanceReader.nextInt();
        System.out.println("Current balance: " + currentBalance);

        while(true) {
            System.out.println("Enter amount recharge amount (200-1000): ");
            int rechargeAmount = scanner.nextInt();

            if (rechargeAmount >= 200 && rechargeAmount <= 1000) {
                int nB = currentBalance + rechargeAmount;

                FileWriter balanceWiper = new FileWriter("WashCardBalance");

                balanceWriter.write(Integer.toString(nB));
                balanceWriter.close();

                int newBalance = newBalanceReader.nextInt();
                System.out.println("New balance: " + newBalance);
            }
            else{
                System.out.println("Recharge amount too high or low, try again.");
            continue;
            }
            break;
        }
    }
}