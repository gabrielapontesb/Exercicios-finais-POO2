package util;

import cdp.Carro;

/**
 * Created by gabriela on 29/01/16.
 */
public class DesligarCarro implements I_Comando {
    private Carro carro;

    public DesligarCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void botaoPressionado() {
        carro.desligarCarro();
    }

    @Override
    public String toString() {
        return "Fechado";
    }
}
