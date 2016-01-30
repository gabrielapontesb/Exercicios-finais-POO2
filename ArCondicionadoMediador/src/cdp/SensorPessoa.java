package cdp;

/**
 * Created by gabriela on 29/01/16.
 */
public class SensorPessoa {

    private int qtd;
    private ArCondicionado ar;

    public SensorPessoa(ArCondicionado ar) {
        this.ar = ar;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
        ar.update();
    }

}
