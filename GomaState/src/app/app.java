package app;

import util.Maquina;

/**
 * Created by gabriela on 29/01/16.
 */
public class app {
    public static void main(String args[]) {

        Maquina maquina = new Maquina(1);
        maquina.poemMoeda(20);
        maquina.puxaAlavanca();
    }
}
