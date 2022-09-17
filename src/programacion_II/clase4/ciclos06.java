package programacion_II.clase4;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Ejercicio 6: Pedir numeros hasta que se teclee un 0,mostrar la suma de todos los numeros introducidos */
public class ciclos06 {
    public static void main(String[] args) {
        // Scanner entrada= new Scanner(System.in);
        // int numero,suma=0;
        // do{
        //     System.out.println("Digite un numero: ");
        //     numero=Integer.parseInt(entrada.nextLine());
        //     suma += numero;
        // }while(numero != 0);
        // System.out.println("\n La suma de todos los numeros ingresados es: " + suma);

        int numero, suma=0;
        do{
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
        }while(numero != 0);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es: " + suma);
    }
}
