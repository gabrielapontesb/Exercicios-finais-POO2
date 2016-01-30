package util;
import java.util.HashMap;

/**
 * Created by gabriela on 29/01/16.
 */
public class Maquina {

    public HashMap<String, EstadoMaquina> estados;
    public int goma;
    public EstadoMaquina estadoMaquina;


    public Maquina(int goma) {
        estados = new HashMap<>();
        estados.put("sem moeda", new SemMoeda(this));
        estados.put("com moeda", new RecebeMoeda(this));
        estados.put("goma vendida", new GomaVendida(this));
        estados.put("sem goma", new GomasAcabaram(this));
        this.setState("sem moeda");
        this.goma = goma;

    }
    public EstadoMaquina getState(){
        return this.estadoMaquina;
    }
    public void setState(String estado) {
        this.estadoMaquina = estados.get(estado);
    }
    public void poemMoeda(int moeda) {
        this.estadoMaquina.poeMoeda(moeda);
    }
    public void puxaAlavanca() {
        this.estadoMaquina.puxaAlavanca();
    }
    public void entregaGoma() {
        this.estadoMaquina.poeMoeda(0);
    }
}
