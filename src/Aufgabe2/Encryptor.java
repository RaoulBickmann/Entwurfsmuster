package Aufgabe2;

/**
 * Created by Raoul on 05.06.2016.
 */
public class Encryptor {

    private EncryptionStrategy strategy;

    public Encryptor() {

    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String input) {
        String output = strategy.encrypt(input);
        return output;
    }
}
