package br.com.gpbreis.c3.c3_6;
import javax.swing.JOptionPane;
public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name?");

        String message = String.format("Welcome, %s, to Java Programming!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
