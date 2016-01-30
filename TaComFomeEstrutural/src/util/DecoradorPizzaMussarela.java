package util;

import cdp.Pizza;

/**
 * Created by gabriela on 29/01/16.
 */
public class DecoradorPizzaMussarela extends PizzaDecorator {

    public DecoradorPizzaMussarela(Pizza pizzadecorada) {
        super(pizzadecorada);
    }

    public void fazer(){
        addIngredientesMussarela();
        pizzadecorada.fazer();
    }

    private void addIngredientesMussarela(){
        Facade facade = new Facade();
        facade.criarIngredientesMussarela();
    }
}
