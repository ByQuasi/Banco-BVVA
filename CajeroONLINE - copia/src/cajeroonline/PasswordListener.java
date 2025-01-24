/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroonline;

import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author User
 */
public class PasswordListener implements DocumentListener {

    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel statusLabel;
    private JButton registerButton;

    public PasswordListener(JPasswordField passwordField1, JPasswordField passwordField2, JLabel statusLabel, JButton registerButton) {
        this.passwordField1 = passwordField1;
        this.passwordField2 = passwordField2;
        this.statusLabel = statusLabel;
        this.registerButton = registerButton;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        verificarContraseñas();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        verificarContraseñas();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        verificarContraseñas();
    }

    private void verificarContraseñas() {
        char[] pass1 = passwordField1.getPassword();
        char[] pass2 = passwordField2.getPassword();
        if (Arrays.equals(pass1, pass2) && pass1.length > 0) {
            statusLabel.setText("Las contraseñas coinciden.");
            registerButton.setEnabled(true);
        } else {
            statusLabel.setText("Las contraseñas no son iguales.");
            registerButton.setEnabled(false);
        }
    }
}
