package util;

import cdp.*;

/**
 * Created by gabriela on 29/01/16.
 */
public interface I_FabricaIngrediente {

    public Molho criarMolho();
    public Massa criarMassa(String tipo);
    public Presunto criarPresunto();
    public Cebola criarCebola();
    public Queijo criarQueijo(String tipo);
}
