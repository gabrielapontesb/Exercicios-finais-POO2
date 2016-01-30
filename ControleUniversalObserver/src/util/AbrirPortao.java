package util;

import cdp.Portao;

/**
 * Created by gabriela on 29/01/16.
 */
public class AbrirPortao implements I_Comando {
    private Portao portao;

    public AbrirPortao(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void botaoPressionado() {
        portao.abrirPortao();
    }

    @Override
    public String toString() {
        return "Aberto";
    }
}
