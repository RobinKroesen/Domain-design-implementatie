package Restaurant;

public class Main {
    public static void main(String[] args){

        //restaurant data voor het testen
        Ober ober1 = new Ober("Gert");
        Klant p1 = new Klant("Henk", "Kip");
        Klant p2 = new Klant("Piet", "Patat");
        Klant p3 = new Klant("Sophie", "Soep");
        Klant p4 = new Klant("Anna", "Brood");
        Tafel t1 = new Tafel(p1.naam, null, null, p4.naam, ober1.naam, 5);
        Tafel t2 = new Tafel(p2.naam, p1.naam, p4.naam, p3.naam, ober1.naam, 3);

        //Test of programma tafel info goed leest
        System.out.println("aantal tafels:"+ t1.aantalTafels);
        //tafel met alle stoelen gevuld
        System.out.println(t1);
        //tafel met 2 lege stoelen
        System.out.print(t2);

        //Test weergave klantinfo
        System.out.println('\n');
        System.out.println("Aantal klanten:"+ p1.aantalKlanten);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);





    }
}
