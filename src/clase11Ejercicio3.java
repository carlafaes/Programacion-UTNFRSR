//Leer 2 numeros, si son iguales que los multiplique, si el primero es mayor que el segundo que los reste, y sino que los sume.

import java.util.Scanner;

public class clase11Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        double num1,num2,resultado;
        System.out.println("Digite el primer numero: ");
        num1= Double.parseDouble(entrada.nextLine());
        System.out.println("Digite el segundo numero: ");
        num2= Double.parseDouble(entrada.nextLine());
        if(num1 == num2){
            resultado= num1 * num2;
        }
        else if(num1 > num2){
            resultado= num1 - num2;
        }
        else{
            resultado= num1 + num2;
        }
        System.out.println("El resultado es "+ resultado);
    }
}
