package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class AbstractEstadoMaquina implements EstadoMaquina {

    protected Maquina maquina;

    public AbstractEstadoMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void poeMoeda(int moedas){}

    @Override
    public void puxaAlavanca() {}
}
