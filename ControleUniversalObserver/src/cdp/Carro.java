package cdp;

/**
 * Created by gabriela on 29/01/16.
 */
public class Carro {

    private StatusCarro status;

    public Carro() {
        status = StatusCarro.LIGAR;
        System.out.println("Fechado");
    }

    public void ligarCarro() {
        status = StatusCarro.LIGAR;
        System.out.println("Aberto");
    }

    public void desligarCarro() {
        status = StatusCarro.DESLIGAR;
        System.out.println("Fechado");
    }
}
