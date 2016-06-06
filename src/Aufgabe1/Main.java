package Aufgabe1;

/**
 * Created by Raoul on 05.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        Rechnung rechnung = new Rechnung();
        Artikel artikel1 = new Artikel("Festplatte", 89.99f);
        Artikel artikel2 = new Artikel("USB-Stick", 19.99f);
        Artikel artikel3 = new Artikel("Mauspad", 3.33f);

        rechnung.add(artikel1);
        rechnung.add(artikel2);
        rechnung.add(artikel3);

        rechnung.setPrint(new PrintHTML());

        rechnung.drucken();
    }
}
