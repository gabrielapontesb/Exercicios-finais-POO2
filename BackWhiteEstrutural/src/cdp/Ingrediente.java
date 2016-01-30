package cdp;

/**
 * Created by gabriela on 29/01/16.
 */
public class Ingrediente {

    private String nome;
    private int qtd;

    public Ingrediente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String toString(){
        return nome;
    }
}
