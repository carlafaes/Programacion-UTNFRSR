package programacion_II.clase3;

import javax.swing.JOptionPane;
/*Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y nmostrar cuantos numeros se han ontroducido.  */
public class ejercicio2 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero "+ numero + " es POSITIVO");
            conteo++;
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresado "+ conteo + " numeros que no son negativos");
    }

}
