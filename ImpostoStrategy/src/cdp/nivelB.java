package cdp;

import util.CalculaImposto;

/**
 * Created by gabriela on 29/01/16.
 */
public class nivelB implements CalculaImposto {

    @Override
    public float salarioComImposto(float valor) {
        return (float) (valor * 0.075);
    }
}
