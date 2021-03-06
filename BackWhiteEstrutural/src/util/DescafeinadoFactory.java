package util;

import cdp.Cafe;
import cdp.Ingrediente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriela on 29/01/16.
 */
public class DescafeinadoFactory implements I_CafeFactory {
    final double PRICE = 3.0;

    @Override
    public Cafe criarCafe() {
        Cafe ca = new Cafe();
        ca.setPreco(PRICE);
        ca.setIngredientes((ArrayList<Ingrediente>) fabricarIngredientes());
        return ca;
    }

    @Override
    public List<Ingrediente> fabricarIngredientes() {
        IngredienteFactory ifac = new IngredienteFactory();
        ArrayList<Ingrediente> ingred = new ArrayList<>();
        ingred.add(ifac.criarIngrediente("cafe descafeinado", 50));
        ingred.add(ifac.criarIngrediente("acucar", 2));
        ingred.add(ifac.criarIngrediente("leite", 100));
        ingred.add(ifac.criarIngrediente("agua", 100));

        return ingred;
    }
}
