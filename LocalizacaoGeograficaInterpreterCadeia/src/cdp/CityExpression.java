package cdp;

/**
 * Created by gabriela on 30/01/16.
 */
public class CityExpression implements Expressao {
    private City cidade;

    public CityExpression(City cidade) {
        this.cidade = cidade;
    }


    @Override
    public City interpretar() {
        return cidade;
    }
}
