package Aufgabe2;

/**
 * Created by Raoul on 05.06.2016.
 */
public class ReverseEncryptor implements EncryptionStrategy {
    @Override
    public String encrypt(String input) {
        String output = "";
        char temp[] = input.toCharArray();

        for (int i = temp.length-1; i >= 0; i--) {
            output += temp[i];
        }
        return output;
    }
}
