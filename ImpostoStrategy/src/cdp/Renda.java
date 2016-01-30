package cdp;

import util.CalculaImposto;

/**
 * Created by gabriela on 29/01/16.
 */
public class Renda {

    public CalculaImposto imposto;

    public Renda() {
        imposto = new nivelA();
    }

    public void calculoDoImposto(float valor){

        if(valor <= 1710.78)
            this.imposto = new nivelA();
        else if(valor >= 1710.79 && valor <= 2563.91)
            this.imposto = new nivelB();
        else if(valor >= 2563.92 && valor <= 3418.59)
            this.imposto = new nivelC();
        else if(valor >= 3418.60 && valor <= 4271.59)
            this.imposto = new nivelD();
        else if(valor > 4271.59)
            this.imposto = new nivelE();

        imposto.salarioComImposto(valor);

    }
}
