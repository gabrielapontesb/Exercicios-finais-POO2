package util;

import cdp.Ingrediente;

/**
 * Created by gabriela on 29/01/16.
 */
public class IngredienteFactory implements I_IngredienteFactory{

    @Override
    public Ingrediente criarIngrediente(String nome, int qtd) {
        Ingrediente ing = new Ingrediente();
        ing.setNome(nome);
        ing.setQtd(qtd);
        return ing;
    }


}
