package CarWash;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Menuselection menuSelection = new Menuselection();
        WashCardRecharge washCardRecharge = new WashCardRecharge();
        menuSelection.menu();
        washCardRecharge.recharge();


    }
}
