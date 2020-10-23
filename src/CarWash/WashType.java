package CarWash;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WashType {
    public void carWashType() {
        System.out.println("1. Economy wash\n2. Standard wash\n3. DeLuxe Wash");
    }


    public void carWashTypePrice() throws IOException {
        File carWashPrice = new File("CarWashPrice");
        Scanner balanceReader = new Scanner(carWashPrice);
        ArrayList<String> carWashPriceList = new ArrayList<>();

        while (balanceReader.hasNextLine()){
            carWashPriceList.add(balanceReader.nextLine());
        }
        String economyWashStr = carWashPriceList.get(0);
        String standardWashStr = carWashPriceList.get(1);
        String deLuxeWashStr = carWashPriceList.get(2);


        int economyWash = Integer.parseInt(economyWashStr);
        int standardWash = Integer.parseInt(standardWashStr);
        int deLuxeWash = Integer.parseInt(deLuxeWashStr);

    }

}