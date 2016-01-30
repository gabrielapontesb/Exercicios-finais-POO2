package application;

import util.CafeFactory;
/**
 * Created by gabriela on 29/01/16.
 */
public class App {

    public static void main(String args[]){
        CafeFactory cf = new CafeFactory();

        System.out.print(cf.criarCafe("descafeinado"));
        System.out.print(cf.criarCafe("capuccino"));
        System.out.print(cf.criarCafe("normal"));
    }
}



