package util;

import cdp.Massa;
import cdp.Molho;
import cdp.Pizza;
import cdp.Recheio;

/**
 * Created by gabriela on 29/01/16.
 */
public interface I_Fabrica {

    public Massa criarMassa();
    public Recheio criarRecheio();
    public Molho criarMolho();
    public Pizza criarPizza();

}
