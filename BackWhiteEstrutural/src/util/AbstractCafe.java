package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class AbstractCafe implements I_Cafe{

    private float preco;

    public AbstractCafe(float preco){
        this.preco += preco;
    }

    @Override
    public float get_price() {
        return this.preco;
    }

}
