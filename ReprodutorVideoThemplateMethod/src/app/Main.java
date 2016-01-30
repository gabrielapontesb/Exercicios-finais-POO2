package app;

import cdp.AVI;
import cdp.AbstractFormato;
/**
 * Created by gabriela on 30/01/16.
 */
public class Main {

    public static void main(String[] args) {
        AbstractFormato StarWars = new AVI();
        StarWars.start("starWars.avi", "starWars.leg");
    }

}
