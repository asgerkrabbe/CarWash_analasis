package CarWash;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Wash {
    WashType washType = new WashType();
    Scanner scanner = new Scanner(System.in);
    StopCarWash stopCarWash = new StopCarWash();
    FileWriter washCharger = new FileWriter("WashCardBalance", true);

    public Wash() throws IOException {
    }


    public void wash() throws IOException {
        washType.carWashType();

        System.out.println("Choose wash type:\n");
        washType.carWashType();
        int washTypeSelection = scanner.nextInt();

        if (washTypeSelection == 1) {
            System.out.println("Economy wash chosen " + washType.getEconomyWash() + ",- will be conducted from your washcard balance.");
            washChargeEconomy();
        }
        if (washTypeSelection == 2) {
            System.out.println("Standard wash chosen " + washType.getStandardWash() + ",- will be conducted from your washcard balance.");
        }
        if (washTypeSelection == 3) {
            System.out.println("DeLuxe wash chosen " + washType.getDeLuxeWash() + ",- will be conducted from your washcard balance.");
        }
        stopCarWash.run();
    }

    public void washChargeEconomy() throws IOException {
        File balance = new File("WashCardBalance");
        Scanner balanceReader = new Scanner(balance);
        Scanner newBalanceReader = new Scanner(balance);

        int currentBalance = balanceReader.nextInt();

        int nB = currentBalance - washType.getEconomyWash();

        FileWriter balanceWiper = new FileWriter("WashCardBalance");

        washCharger.write(Integer.toString(nB));
        washCharger.close();


        int newBalance = newBalanceReader.nextInt();
        System.out.println("New balance: " + newBalance);
    }
}
