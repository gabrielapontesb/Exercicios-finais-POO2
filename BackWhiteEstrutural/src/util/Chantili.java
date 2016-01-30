package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class Chantili extends CafeAbstratoOption{

    public Chantili(I_Cafe cafe) {
        super(cafe);
    }

    public float getPrice(){
        return (float) (cafeDecorado.get_price() + 1.00);
    }
}
