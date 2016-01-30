package util;

import cdp.*;

/**
 * Created by gabriela on 29/01/16.
 */
public class FabricaIngrediente implements I_FabricaIngrediente {

    @Override
    public Molho criarMolho() {
        Molho molho = new Molho();
        return molho;
    }

    @Override
    public Massa criarMassa(String tipo) {
        if (tipo.equals("Tradicional")){
            MassaTradicional massa = new MassaTradicional();
            return massa;
        }
        else{
            MassaCone massa = new MassaCone();
            return massa;
        }

    }

    @Override
    public Presunto criarPresunto() {
        Presunto presunto = new Presunto();
        return presunto;
    }

    @Override
    public Cebola criarCebola() {
        Cebola cebola = new Cebola();
        return cebola;
    }

    @Override
    public Queijo criarQueijo(String tipo) {
        if (tipo.equals("Gorgonzola")){
            QueijoGorgonzola qg = new QueijoGorgonzola();
            return qg;
        }

        else if (tipo.equals("Margherita")){
            QueijoMargherita qm = new QueijoMargherita();
            return qm;
        }

        else if (tipo.equals("Provolone")){
            QueijoProvolone qpro = new QueijoProvolone();
            return qpro;
        }

        else if (tipo.equals("Parmesao")){
            QueijoParmesao qpar = new QueijoParmesao();
            return qpar;
        }

        else{
            QueijoMussarela qmus = new QueijoMussarela();
            return qmus;        }
    }

}
