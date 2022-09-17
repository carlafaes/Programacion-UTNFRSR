package programacion_II.clase2;

import java.util.Scanner;

import javax.swing.JOptionPane;

/* CICLOS 01
Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negatico */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Scanner entrada= new Scanner(System.in);

        // int numero, cuadrado;
        // System.out.println("Digite un numero: ");
        // numero= Integer.parseInt(entrada.nextLine());
        // while(numero >= 0){
        // cuadrado=(int)Math.pow(numero,2);
        // System.out.println("El numero " + numero + " elevado al cuadrado es: "+
        // cuadrado);
        // System.out.println("Digite otro numero:");
        // numero= Integer.parseInt(entrada.nextLine());
        // }
        // System.out.println("El programa ha finalizado por numero negativo");
        // }
        

        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: " + cuadrado);
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("El programa ha finalizado por numero negativo");
    }
}

