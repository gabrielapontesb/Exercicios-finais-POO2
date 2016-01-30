package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class Facade {

    private FabricaIngrediente fabricaIngrediente;
    public Facade(){}
    public void criarIngredientes4queijos(){
        fabricaIngrediente.criarMassa("Cone");
        fabricaIngrediente.criarMolho();
        fabricaIngrediente.criarQueijo("Parmesao");
        fabricaIngrediente.criarQueijo("Mussarela");
        fabricaIngrediente.criarQueijo("Margherita");
        fabricaIngrediente.criarQueijo("Provolone");
        fabricaIngrediente.criarQueijo("Gorgonzola");
        fabricaIngrediente.criarQueijo("Cebola");
        fabricaIngrediente.criarQueijo("Presunto");
    }

    public void criarIngredientesMussarela(){
        fabricaIngrediente.criarMassa("Tradicional");
        fabricaIngrediente.criarMolho();
        fabricaIngrediente.criarQueijo("Mussarela");
        fabricaIngrediente.criarQueijo("Gorgonzola");
        fabricaIngrediente.criarCebola();
        fabricaIngrediente.criarPresunto();
    }
}
