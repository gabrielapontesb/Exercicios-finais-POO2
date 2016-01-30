package cdp;

import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;

/**
 * Created by gabriela on 29/01/16.
 */
public class ArCondicionado implements Observer {

    private static final int alertaTemp = 25;

    private Integer qtdPessoas;
    private Integer temperatura;

    private ArrayList<Sensor> sensores;

    public ArCondicionado() {
        this.sensores = new ArrayList<Sensor>();
    }

    private Integer MediaPessoas() {
        int soma = 0;
        int totalsensores = sensores.size();
        for(Sensor s: sensores) {
            soma += s.getQtdPessoas();
        }
        return soma / totalsensores;
    }

    private Integer MediaTemperatura() {
        int soma = 0;
        int totalsensores = sensores.size();
        for(Sensor s: sensores) {
            soma += s.getTempAmbiente();
        }
        return soma / totalsensores;
    }

    @Override
    public void update(Observable o, Object arg) {

        Sensor sensor = (Sensor) o;
        sensores.add(sensor);
        this.qtdPessoas = this.MediaPessoas();
        this.temperatura = this.MediaTemperatura() + this.qtdPessoas;
        if (this.temperatura > alertaTemp){
            System.out.printf("Temperatura %dº, esta acima\n", this.temperatura);
        }else{
            System.out.printf("Temperatura %dº, esta correta\n", this.temperatura);
        }
    }
}
