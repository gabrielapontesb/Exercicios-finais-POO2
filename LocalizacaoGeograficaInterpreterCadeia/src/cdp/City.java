package cdp;

/**
 * Created by gabriela on 30/01/16.
 */
public class City {

    private String nome;
    private double latitude, longitude;

    public City(String nome, double latitude, double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean equals(Object outro) {
        if(this == outro)
            return true;
        if( !(outro instanceof City))
            return false;

        City outraCidade = (City) outro;
        return getNome().equals(outraCidade.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

    @Override
    public String toString() {
        return getNome();
    }

}
