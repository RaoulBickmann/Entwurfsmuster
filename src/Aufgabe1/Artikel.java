package Aufgabe1;

/**
 * Created by Raoul on 05.06.2016.
 */
public class Artikel {

    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Artikel(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
