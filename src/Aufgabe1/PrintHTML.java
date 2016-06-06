package Aufgabe1;

import java.util.ArrayList;

/**
 * Created by Raoul on 05.06.2016.
 */
public class PrintHTML implements PrintFormats {

    public void print(ArrayList<Artikel> list) {
        System.out.println("<table>");
        for (Artikel i: list) {
            System.out.println("\t<tr>");
            System.out.println("\t\t<td>" + i.getName() + "</td>");
            System.out.println("\t\t<td>" + i.getPrice() + "</td>");
            System.out.println("\t</tr>");
        }
        System.out.println("</table>");
    }
}
