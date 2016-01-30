package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class GomasAcabaram extends AbstractEstadoMaquina{

    GomasAcabaram(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void puxaAlavanca() {
        System.out.println("Maquina sem chicletes");
    }

    @Override
    public void poeMoeda(int moedas) {
        System.out.println("Maquina sem chicletes");
    }
}
