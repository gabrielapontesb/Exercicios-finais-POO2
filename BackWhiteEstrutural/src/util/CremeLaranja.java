package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class CremeLaranja extends CafeAbstratoOption{

    public CremeLaranja(I_Cafe cafe) {
        super(cafe);
    }

    public float getPrice(){
        return (float) (cafeDecorado.get_price() + 1.5);
    }
}
