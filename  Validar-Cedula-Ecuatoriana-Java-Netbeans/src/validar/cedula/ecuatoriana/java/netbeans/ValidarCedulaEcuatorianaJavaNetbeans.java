/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validar.cedula.ecuatoriana.java.netbeans;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maquina
 */
public class ValidarCedulaEcuatorianaJavaNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        String cedula = JOptionPane.showInputDialog("Ingrese su número de cédula");
        int c, suma = 0, acum, resta = 0;

        for (int i = 0; i < cedula.length() - 1; i++) {
            c = Integer.parseInt(cedula.charAt(i) + "");
            if (i % 2 == 0) {
                c = c * 2;
                if (c > 9) {
                    c = c - 9;
                }
            }

            suma = suma + c;
        }

        if (suma % 10 != 0) {
            acum = ((suma / 10) + 1) * 10;
            resta = acum - suma;
        }

        int ultimo = Integer.parseInt(cedula.charAt(9) + "");

        if (ultimo == resta) {
            JOptionPane.showMessageDialog(null, "La cédula ingresada es correcta");
        } else {
            JOptionPane.showMessageDialog(null, "La cédula ingresada es incorrecta", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }

    }
}
