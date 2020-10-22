package CarWash;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Wash {
    private int washselect;
    private String washtype;
    private int time;
    private int price;
    private int economy = 50;
    private int standard = 80;
    private int deLuxe = 120;
    WashType washType = new WashType();
    Scanner scanner = new Scanner(System.in);
    StopCarWash stopCarWash = new StopCarWash();
    FileWriter washCharger = new FileWriter("WashCardBalance",true);

    public Wash() throws IOException {
    }

    public int getEconomy() {
        return economy;
    }

    public int getStandard() {
        return standard;
    }

    public int getDeLuxe() {
        return deLuxe;
    }


    public void wash() throws IOException {
        washType.type();

        System.out.println("Choose wash type:\n");
        washType.type();
        int washTypeSelection = scanner.nextInt();

        if (washTypeSelection == 1){
            System.out.println("Economy wash chosen " + getEconomy() + ",- will be conducted from your washcard balance.");
            washChargeEconomy();
        }
        if (washTypeSelection == 2){
            System.out.println("Standard wash chosen " + getStandard() + ",- will be conducted from your washcard balance.");
        }
        if (washTypeSelection == 3){
            System.out.println("DeLuxe wash chosen " + getDeLuxe() + ",- will be conducted from your washcard balance.");
        }
        stopCarWash.run();
    }

    public void washChargeEconomy() throws IOException {
        File balance = new File("WashCardBalance");
        Scanner balanceReader = new Scanner(balance);
        Scanner newBalanceReader = new Scanner(balance);

        int currentBalance = balanceReader.nextInt();

        int nB = currentBalance - getEconomy();

        FileWriter balanceWiper = new FileWriter("WashCardBalance");

        washCharger.write(Integer.toString(nB));
        washCharger.close();


        int newBalance = newBalanceReader.nextInt();
        System.out.println("New balance: " + newBalance);
    }

    @Override
    public String toString() {
        return null;
    }
}
