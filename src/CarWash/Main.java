package CarWash;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WashCardRecharge washCardRecharge = new WashCardRecharge();
        Admin admin = new Admin();
        Menuselection menuSelection = new Menuselection();
        //WashType washType = new WashType();
        menuSelection.menu();
        admin.changeWashPrice();
        //washType.carWashTypePrice();

        System.out.println("Don't forget your washcard!");
    }
}
