package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class GomaVendida extends AbstractEstadoMaquina {

    public GomaVendida(Maquina maquina) {

        super(maquina);

    }

    @Override
    public void poeMoeda(int moedas) {
        if(this.maquina.goma > 0) {
            System.out.println("Chiclete entregue");
            this.maquina.setState("sem moeda");
        } else {
            System.out.println("Maquina sem chiclete");
            this.maquina.setState("sem goma");

        }
    }

    @Override
    public void puxaAlavanca() {
    }
}
