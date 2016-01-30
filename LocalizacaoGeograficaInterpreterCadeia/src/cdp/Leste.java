package cdp;

import java.util.List;

/**
 * Created by gabriela on 30/01/16.
 */
public class Leste implements Expressao {
    private List<Expressao> expressoes;

    public Leste(List<Expressao> expressoes) {
        this.expressoes = expressoes;
    }

    @Override
    public City interpretar() {
        City resultado = expressoes.get(0).interpretar();

        for(Expressao atual: expressoes) {
            City cidade = atual.interpretar();
            if(cidade.getLongitude() > resultado.getLatitude())
                resultado = cidade;

        }
        return resultado;
    }
}
