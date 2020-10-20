package CarWash;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WashCardRecharge washCardRecharge = new WashCardRecharge();
        Menuselection menuSelection = new Menuselection();
        menuSelection.menu();


        System.out.println("Don't forget your washcard!");
    }
}
