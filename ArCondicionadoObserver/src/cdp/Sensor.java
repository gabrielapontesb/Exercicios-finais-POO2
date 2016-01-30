package cdp;

import java.util.Observable;

/**
 * Created by gabriela on 29/01/16.
 */
public class Sensor extends Observable {
    private int TempAmbiente;
    private int qtdPessoas;

    public Sensor() {
    }

    public float getTempAmbiente() {
        return TempAmbiente;
    }

    public void setTempAmbiente(int temperatura) {
        this.TempAmbiente = temperatura;
        setChanged();
        notifyObservers();
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int num) {
        this.qtdPessoas = num;
        setChanged();
        notifyObservers();
    }

}
