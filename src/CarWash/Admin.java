package CarWash;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Scanner scanner = new Scanner(System.in);


    public void adminLogin() {
        String adminPassword = "1234";
        System.out.println("Type amin password: ");

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
    public void changeWashPrice() throws IOException {
        FileWriter carWashWriter = new FileWriter("CarWashPrice",true);
        File carWashPrice = new File("CarWashPrice");
        Scanner balanceReader = new Scanner(carWashPrice);
        ArrayList<String> carWashPriceList = new ArrayList<>();

        while (balanceReader.hasNextLine()){
            carWashPriceList.add(balanceReader.nextLine());
        }
        System.out.println(carWashPriceList.get(1));
        //System.out.println(carWashPrice[1]);

        //carWashWriter.write(Integer.toString(nB));
        //carWashWriter.close();
    }
}