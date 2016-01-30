package util;

import cdp.Carro;

/**
 * Created by gabriela on 29/01/16.
 */
public class LigarCarro implements I_Comando {
    private Carro carro;

    public LigarCarro(Carro carro) {
        this.carro = carro;
    }

    public void botaoPressionado() {
        carro.ligarCarro();
    }

    @Override
    public String toString() {
        return "Ligado";
    }
}
