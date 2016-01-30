package util;

/**
 * Created by gabriela on 29/01/16.
 */
public class CafeAbstratoOption extends AbstractCafe{

    protected I_Cafe cafeDecorado;

    public CafeAbstratoOption(I_Cafe cafe) {
        super(cafe.get_price());
        this.cafeDecorado = cafe;
    }

}
