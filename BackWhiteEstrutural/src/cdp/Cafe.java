package cdp;

import java.util.ArrayList;

/**
 *
 * @author Gabriela Pontes
 */

public class Cafe {

    private double preco;
    private ArrayList<Ingrediente> ingredientes;

    public Cafe(){}

    public Cafe(double preco) {
        this.preco = preco;
    }

    public Cafe(double preco, ArrayList<Ingrediente> ingrediente){
        this.preco = preco;
        this.ingredientes = ingrediente;

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String toString(){
        String out = "Meus ingredientes:";
        for (int i = 0; i < ingredientes.size(); i++){
            out += " " + ingredientes.get(i).toString();
        }

        return out;
    }
}