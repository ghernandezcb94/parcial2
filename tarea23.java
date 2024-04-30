/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author ghernandez
 */
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero entero"));
        
        if (numero > 3) {
            JOptionPane.showMessageDialog(null,"El numero ingresado es mayor a 3");
        }
    }   
}
