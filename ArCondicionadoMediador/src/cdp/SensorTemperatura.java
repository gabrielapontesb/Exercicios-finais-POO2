package cdp;

/**
 * Created by gabriela on 29/01/16.
 */
public class SensorTemperatura {

    private ArCondicionado ar;
    private double temperatura;

    public SensorTemperatura(ArCondicionado ac) {
        this.ar = ar;
    }
    public double getTemp() {
        return temperatura;
    }
    public void setTemp(int temp) {
        this.temperatura = temp;
        ar.update();
    }
}
