package util;

import cdp.Massa;
import cdp.Molho;
import cdp.Pizza;
import cdp.Recheio;

/**
 * Created by gabriela on 29/01/16.
 */
public class FabricaPizza implements I_Fabrica{

    @Override
    public Massa criarMassa(){
        Massa massa = new Massa("traditional");
        return massa;
    }

    @Override
    public Molho criarMolho(){
        Molho molho = new Molho("tomato");
        return molho;
    }


    @Override
    public Recheio criarRecheio(){
        Recheio recheio = new Recheio("muscatel");
        return recheio;
    }

}
