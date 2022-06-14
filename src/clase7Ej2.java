import java.util.Scanner;

//Ejercicio 2: Hacer un programa que calculo e imprima el salario de un empleado, a partir de sus horas semanales trabajadas y de su salario por hora.

public class clase7Ej2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioHora,salarioTotal;

        System.out.println("Ingrese las horas semanales trabajadas: ");
        horasSemanales= Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el salario por hora: ");
        salarioHora= Float.parseFloat(entrada.nextLine());

        salarioTotal= horasSemanales*salarioHora;
        System.out.println("El salario total es: " + salarioTotal);
}
}
