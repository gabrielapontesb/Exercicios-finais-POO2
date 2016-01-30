package cdp;

/**
 * Created by gabriela on 30/01/16.
 */
public abstract class AbstractFormato {

    protected abstract int getArquivo(String arquivo);
    protected abstract void getLegenda(String legenda);
    protected abstract void reproduzirArquivo(int arq);
    protected abstract void finaliza();

    public final void start(String arquivo, String legenda){
        /*do something*/
        this.finaliza();
    }
}
