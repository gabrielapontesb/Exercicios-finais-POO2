package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class SemMoeda extends AbstractEstadoMaquina {

    SemMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void poeMoeda(int moedas) {
        if(moedas == 1) {
            System.out.println("moeda inserida");
            this.maquina.setState("com moeda");
        } else {
            System.out.println("Insira uma moeda de 1 real");

        }

    }

    @Override
    public void puxaAlavanca() {
        System.out.println("Alavanca puxada");
    }
}
