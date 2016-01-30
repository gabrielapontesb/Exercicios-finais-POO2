package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class Chocolate extends CafeAbstratoOption{

    public Chocolate(I_Cafe cafe) {
        super(cafe);
    }

    public float getPrice(){
        return (float) (cafeDecorado.get_price() + 0.5);
    }
}
