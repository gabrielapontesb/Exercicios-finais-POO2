package cdp;

/**
 * Created by gabriela on 30/01/16.
 */
public class MP3 extends AbstractFormato {

    @Override
    protected int getArquivo(String arquivo) {
        return 2;
    }

    @Override
    protected void getLegenda(String legenda) {
        System.out.println("Obtendo legenda");
    }

    @Override
    protected void reproduzirArquivo(int arq){}

    @Override
    protected void finaliza() {
        System.out.println("Finalizado!");
    }
}
