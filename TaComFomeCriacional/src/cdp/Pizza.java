package cdp;

/**
 * Created by gabriela on 29/01/16.
 */
public class Pizza {

    Massa massa;
    Molho molho;
    Recheio recheio;

    public Molho getMolho() {
        return molho;
    }

    public void setMolho(Molho molho) {
        this.molho = molho;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

}
