package app;

import cdp.City;
import cdp.Directional;

/**
 * Created by gabriela on 30/01/16.
 */
public class Main {

    public static void main(String[] args) {
        Directional evaluator = new Directional();
        City cidade = evaluator.evaluate("Cariacica,Serra,Vitoria,Vila Velha,Oeste");
        System.out.println(" Cidade: " + cidade);
    }

}
