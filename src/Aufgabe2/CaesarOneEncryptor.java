package Aufgabe2;

/**
 * Created by Raoul on 06.06.2016.
 */
public class CaesarOneEncryptor implements EncryptionStrategy {

    private int caesar;

    @Override
    public String encrypt(String input) {
        String output = "";
        char temp[] = input.toCharArray();

        for (int i = 0; i < temp.length; i++) {
            temp[i] += caesar;
            if(temp[i] > 122) {
                System.out.println(temp[i]);
                temp[i] -= 26;
            }
            output += temp[i];
        }
        return output;
    }

    public void setCaesar(int caesar) {
        this.caesar = caesar%26;

    }

    public int getCaesar() {
        return caesar;
    }
}
