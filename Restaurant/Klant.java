package Restaurant;

public class Klant extends Persoon implements Bestelling<Klant>{

    static int aantalKlanten = 0;
    protected java.lang.String gerecht;

    public Klant(java.lang.String naam, java.lang.String gerecht) {
        this.naam = naam;
        this.gerecht = gerecht;
    }
    {
        aantalKlanten += 1;
    }

    public void setGerecht(java.lang.String gerecht) {
        this.gerecht = gerecht;
    }

    @java.lang.Override
    public java.lang.String getGerecht() {
        return gerecht;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                "gerecht='" + gerecht + '\'' +
                '}';
    }
}
