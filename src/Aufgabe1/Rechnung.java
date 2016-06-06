package Aufgabe1;

import java.util.ArrayList;

/**
 * Created by Raoul on 05.06.2016.
 */
public class Rechnung {

    private ArrayList<Artikel> list;
    private PrintFormats printFormats;

    public Rechnung() {
        this.list = new ArrayList<>();
    }

    public void add(Artikel artikel) {
        list.add(artikel);
    }

    public void setPrint(PrintFormats printFormats) {
        this.printFormats = printFormats;
    }

    public void drucken() {
        printFormats.print(list);
    }
}
