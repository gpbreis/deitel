package br.com.gpbreis.c3.c3_6;

import javax.swing.JOptionPane;

public class Adition {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));

        sum = number1 + number2;

        String message = String.format("The sum of %s and %s is %s", number1, number2, sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
