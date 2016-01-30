package cdp;

import util.I_Comando;

/**
 * Created by gabriela on 29/01/16.
 */
public class Controle {

    private I_Comando on, off;
    private static I_Comando LastPressed;

    public void setCommands(I_Comando on, I_Comando off) {
        this.on = on;
        this.off = off;
    }

    public void On() {
        on.botaoPressionado();
        Controle.LastPressed = on;
    }
    public void Off() {
        off.botaoPressionado();
        Controle.LastPressed = off;
    }

    public void refazUltimoBotaoPrecionado() {
        if(Controle.LastPressed != null)
            System.out.println("Ultimo comando " + Controle.LastPressed);
        Controle.LastPressed.botaoPressionado();
    }
}
