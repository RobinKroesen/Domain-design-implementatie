package Restaurant;

public class Tafel {
    static int aantalTafels = 0;
    protected int nummer;
    private final java.lang.String klant1;
    private final java.lang.String klant2;
    private final java.lang.String klant3;
    private final java.lang.String klant4;
    private final java.lang.String ober;

    {
        aantalTafels += 1;
    }

    public Tafel(java.lang.String klant1, java.lang.String klant2, java.lang.String klant3, java.lang.String klant4, java.lang.String ober, int nummer) {
        if(klant1 == null){this.klant1 = "Stoel is leeg";} else { this.klant1 = klant1;}
        if(klant2 == null){this.klant2 = "Stoel is leeg";} else { this.klant2 = klant2;}
        if(klant3 == null){this.klant3 = "Stoel is leeg";} else { this.klant3 = klant3;}
        if(klant4 == null){this.klant4 = "Stoel is leeg";} else { this.klant4 = klant1;}

        //this.klant1 = klant1;
        //this.klant2 = klant2;
        //this.klant3 = klant3;
        //this.klant4 = klant4;
        this.ober = ober;
        this.nummer = nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public java.lang.String getKlant1() {
        return klant1;
    }

    public java.lang.String getKlant2() {
        return klant2;
    }

    public java.lang.String getKlant3() {
        return klant3;
    }

    public java.lang.String getKlant4() {
        return klant4;
    }

    public java.lang.String getOber() {
        return ober;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tafel{" +
                "nummer=" + nummer +
                ", stoel1=" + klant1 +
                ", stoel2=" + klant2 +
                ", stoel3=" + klant3 +
                ", stoel4=" + klant4 +
                ", ober=" + ober +
                '}';
    }
}
