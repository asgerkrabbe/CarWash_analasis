package CarWash;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WashCardRecharge  {

    File washCardBalance = new File("WashCardBalance");
    FileWriter balanceWriter = new FileWriter(washCardBalance,true);

    public WashCardRecharge() throws IOException {
    }


    public void recharge () throws IOException {
        balanceWriter.write("heyoyo");
    }

}