package util;

import cdp.Ingrediente;

/**
 * Created by gabriela on 29/01/16.
 */
public interface I_IngredienteFactory {

    public Ingrediente criarIngrediente(String nome, int qtd);
}
