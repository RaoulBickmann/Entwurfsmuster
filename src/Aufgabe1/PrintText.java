package Aufgabe1;

import java.util.ArrayList;

/**
 * Created by Raoul on 05.06.2016.
 */
public class PrintText implements PrintFormats {

    public void print(ArrayList<Artikel> list) {
        for (Artikel i: list) {
            System.out.println(i.getName() + ": " + i.getPrice());
        }
    }
}
