package CarWash;

import java.io.IOException;
import java.util.Scanner;

public class StopCarWash {
    public void run() {

        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        long sTime = System.currentTimeMillis();
        int count = 0;

        System.out.println("Car wash running, press 1 to stop");
        do {
            count++;
            try {
                if (System.in.available() > 0)
                {
                    String s = sc.nextLine();
                    if (s.equals("1")){
                        stop = true;
                        System.out.println("Stop requested");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (System.currentTimeMillis() - sTime < 5000 && !stop);

        sc.close();
        System.out.println("Finished");
    }
}
