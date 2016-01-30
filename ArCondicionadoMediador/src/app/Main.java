package app;

import cdp.ArCondicionado;
import cdp.SensorPessoa;
import cdp.SensorTemperatura;

/**
 * Created by gabriela on 29/01/16.
 */
public class Main {

    public static void main(String args[]) {
        ArCondicionado ac = new ArCondicionado();

        SensorTemperatura sensorTemp = new SensorTemperatura(ac);
        ac.SensorTemperatura(sensorTemp);
        sensorTemp.setTemp(20);

        SensorPessoa sensorPessoa = new SensorPessoa(ac);
        ac.SensorPessoa(sensorPessoa);
        sensorPessoa.setQtd(10);

    }
}
