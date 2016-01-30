package util;

import cdp.Ingrediente;

/**
 * Created by gabriela on 30/01/16.
 */
public class FabricaIngrediente implements I_FabricaIngrediente{
    @Override
    public Ingrediente criarIngrediente(String nome) {
        Ingrediente ingred = new Ingrediente("ovo");
        return ingred;
    }
}
