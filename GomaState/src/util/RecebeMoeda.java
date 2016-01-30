package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class RecebeMoeda extends AbstractEstadoMaquina {

    RecebeMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void puxaAlavanca() {
        this.maquina.setState("goma vendida");
        this.maquina.entregaGoma();
    }

    @Override
    public void poeMoeda(int moedas) {
        this.maquina.setState("sem moeda");
    }
}
