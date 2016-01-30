package cdp;

import java.util.*;

/**
 * Created by gabriela on 30/01/16.
 */
public class Directional  {
    private Map<String, City> cidades;

    public Directional() {
        cidades = new HashMap<String, City>();
        cidades.put("Serra", new City("Serra", -19.123981,-50.019271 ));
        cidades.put("Vitoria", new City("Vitoria", -20.2976178, -40.2957768 ));
        cidades.put("Cariacica", new City("Cariacica", -20.2643105, -40.4203022));
        cidades.put("Vila Velha", new City("Vila Velha", -21.129419, -45.01928410));

    }
    public City evaluate(String rota) {
        Stack<Expressao> stack = new Stack<Expressao>();
        for(String token: rota.split(",")) {

            if(cidades.containsKey(token)) {
                City cidade = cidades.get(token);
                stack.push(new CityExpression(cidade));
            }
            else if(token.toLowerCase().equals("norte")) {
                stack.push ( new Norte( loadExpressoes(stack) ));
            }
            else if(token.toLowerCase().equals("sul")) {
                stack.push ( new Sul( loadExpressoes(stack) ));
            }
            else if(token.toLowerCase().equals("leste")) {
                stack.push ( new Leste( loadExpressoes(stack) ));
            }
            else if(token.toLowerCase().equals("oeste")) {
                stack.push ( new Oeste( loadExpressoes(stack) ));
            }

        }
        return stack.pop().interpretar();
    }

    private List<Expressao> loadExpressoes(Stack<Expressao> stack){
        List<Expressao> expressoes = new ArrayList<Expressao>();
        while ( !stack.empty()) {
            expressoes.add( stack.pop());
        }
        return expressoes;
    }
}
