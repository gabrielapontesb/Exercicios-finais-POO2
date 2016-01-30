package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class Licor extends CafeAbstratoOption{

    public Licor(I_Cafe cafe) {
        super(cafe);
    }

    public float getPrice(){
        return (float) (cafeDecorado.get_price() + 2.5);
    }
}
