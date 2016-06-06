package Aufgabe2;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Raoul on 05.06.2016.
 */
public class EncryptGui extends JFrame {

    private Encryptor encryptor;
    Map<String, EncryptionStrategy> encryptionMap;


    public EncryptGui() {
        encryptor = new Encryptor();
        encryptor.setStrategy(new ReverseEncryptor());

        encryptionMap = new HashMap<String, EncryptionStrategy>();
        encryptionMap.put("Copy", new CopyEncryptor());
        encryptionMap.put("Reverse", new ReverseEncryptor());
        CaesarOneEncryptor caesarOneEncryptor = new CaesarOneEncryptor();
        encryptionMap.put("Caesar", caesarOneEncryptor);


        Box box = Box.createVerticalBox();
        add(box);

        JTextArea original = new JTextArea(10, 50);
        JTextArea copy = new JTextArea(10, 50);

        original.setBorder(new TitledBorder("Original"));
        copy.setBorder(new TitledBorder("Encrypt"));

        JPanel panel = new JPanel();
        JButton encrypt = new JButton("Encrypt");
        JComboBox comboBox = new JComboBox(encryptionMap.keySet().toArray());
        JButton caesarButton = new JButton("+1 to Caesar");
        caesarButton.setVisible(false);

        panel.add(encrypt);
        panel.add(comboBox);
        panel.add(caesarButton);

        encrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selectedStrategy = comboBox.getSelectedItem();
                EncryptionStrategy strategy = encryptionMap.get(selectedStrategy);
                encryptor.setStrategy(strategy);
                copy.setText(encryptor.encrypt(original.getText()));
            }
        });

        caesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caesarOneEncryptor.setCaesar(caesarOneEncryptor.getCaesar()+1);
            }
        });

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selectedStrategy = comboBox.getSelectedItem();
                EncryptionStrategy strategy = encryptionMap.get(selectedStrategy);
                if(strategy == caesarOneEncryptor){
                    caesarButton.setVisible(true);
                } else {
                    caesarButton.setVisible(false);
                }
            }
        });

        box.add(original);
        box.add(copy);
        box.add(panel);

        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
