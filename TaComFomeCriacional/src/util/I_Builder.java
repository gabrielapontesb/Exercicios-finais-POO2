package util;

import cdp.Pizza;

/**
 * Created by gabriela on 29/01/16.
 */
public interface I_Builder {

    public void prepararMassa();
    public void prepararRecheio();
    public void prepararMolho();
    public Pizza colocarForno();

}
