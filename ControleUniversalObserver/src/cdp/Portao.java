package cdp;

/**
 * Created by gabriela on 29/01/16.
 */
public class Portao {

    private StatusPortao status;

    public Portao() {
        status = StatusPortao.ABRIR;
        System.out.println("Fechado");
    }

    public void abrirPortao() {
        status = StatusPortao.FECHAR;
        System.out.println("Aberto");
    }
    public void fecharPortao() {
        status = StatusPortao.FECHAR;
        System.out.println("Fechado");
    }

}
