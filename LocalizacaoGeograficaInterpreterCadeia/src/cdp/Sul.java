package cdp;

import java.util.List;

/**
 * Created by gabriela on 30/01/16.
 */
public class Sul implements Expressao {
    private List<Expressao> expressoes;

    public Sul(List<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    @Override
    public City interpretar() {
        City resultado = expressoes.get(0).interpretar();
        /*
        *   Percorrendo cidade por cidade e pegando a maior de todas baseado na cidade atual.
        */
        for(Expressao atual: expressoes) {
            City cidade = atual.interpretar();
            if(cidade.getLatitude() < resultado.getLatitude())
                resultado = cidade;

        }
        return resultado;
    }
}
