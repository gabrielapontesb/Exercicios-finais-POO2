package util;

import cdp.Cafe;
import cdp.Ingrediente;

import java.util.List;

/**
 * Created by gabriela on 29/01/16.
 */
public interface I_CafeFactory {

    public Cafe criarCafe();
    public List<Ingrediente> fabricarIngredientes();

}
