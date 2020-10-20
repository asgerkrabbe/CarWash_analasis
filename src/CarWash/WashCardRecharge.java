package CarWash;

import java.io.*;
import java.util.Scanner;

public class WashCardRecharge  {

    FileWriter balanceWriter = new FileWriter("WashCardBalance");
    File balance = new File("WashCardBalance");
    Scanner balanceReader = new Scanner(balance);
    Scanner scanner = new Scanner(System.in);



    public WashCardRecharge() throws IOException {
    }

    public void recharge () throws IOException {
        String currentBalance = null;
        while (balanceReader.hasNextInt()) {
            currentBalance = balanceReader.nextLine();
        }

        assert currentBalance != null;
        int b = Integer.parseInt(currentBalance);
        int rechargeAmount = scanner.nextInt();
        

        int newBalance = rechargeAmount + b;

        balanceWriter.write(newBalance);
        balanceWriter.close();
        balanceReader.close();
    }
}