package util;

import cdp.Pizza;

/**
 * Created by gabriela on 29/01/16.
 */
public class DecoradorPizza4Queijos extends PizzaDecorator {

    public DecoradorPizza4Queijos(Pizza pizzadecorada) {
        super(pizzadecorada);
    }

    public void fazer(){
        addIngredientes4queijos();
        pizzadecorada.fazer();
    }

    private void addIngredientes4queijos(){
        Facade facade = new Facade();
        facade.criarIngredientes4queijos();
    }
}
