package util;

import cdp.Portao;

/**
 * Created by gabriela on 29/01/16.
 */
public class FecharPortao implements I_Comando{
    private Portao portao;

    public FecharPortao(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void botaoPressionado() {
        portao.fecharPortao();
    }
}
