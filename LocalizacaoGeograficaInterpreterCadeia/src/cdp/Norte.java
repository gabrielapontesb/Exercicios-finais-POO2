package cdp;

import java.util.List;

/**
 * Created by gabriela on 30/01/16.
 */
public class Norte implements Expressao {
    private List<Expressao> expressoes;

    public Norte(List<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    @Override
    public City interpretar() {
        City resultado = new City("NULL", -999.9, -999.9);
        /*
        *   Percorrendo cidade por cidade e pegando a maior de todas baseado na cidade atual.
        */
        for (Expressao atual : expressoes) {
            City cidade = atual.interpretar();
            if (cidade.getLatitude() > resultado.getLatitude())
                resultado = cidade;

        }
        return resultado;
    }
}
