package Restaurant;

public class Chef extends Persoon{

    protected java.lang.String gerecht;

    public Chef(java.lang.String naam, java.lang.String gerecht){
        this.naam = naam;
        this.gerecht = gerecht;
    }

    public void setGerecht(java.lang.String gerecht) {
        this.gerecht = gerecht;
    }

}
