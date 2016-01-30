package util;

import cdp.Pizza;

/**
 * Created by gabriela on 29/01/16.
 */
public class BuilderPizza implements I_Builder{
    Pizza pizza = new Pizza();
    protected FabricaPizza fabrica;

    @Override
    public void prepararMassa() {
        pizza.setMassa(fabrica.criarMassa());
    }

    @Override
    public void prepararRecheio() {
        pizza.setRecheio(fabrica.criarRecheio());
    }

    @Override
    public void prepararMolho() {
        pizza.setMolho(fabrica.criarMolho());
    }

    @Override
    public Pizza colocarForno() {
        return pizza;
    }
}
