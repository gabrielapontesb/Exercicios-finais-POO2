package util;

import cdp.Pizza;

/**
 * Created by gabriela on 29/01/16.
 */
public class PizzaDecorator extends Pizza {

    protected Pizza pizzadecorada;

    public PizzaDecorator(Pizza pizzadecorada){

        this.pizzadecorada = pizzadecorada;
    }
}
