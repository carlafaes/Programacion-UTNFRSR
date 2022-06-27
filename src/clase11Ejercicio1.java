//Ejercicio 1: Determinar si un alumno aprueba o repreuba un curso, sabiendo que aprobara si su promedio de tres calificaciones es mayor o igual a 70, reprueba caso contrario.
import java.util.Scanner;

public class clase11Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        double nota1, nota2, nota3, promedio;
        System.out.println("Digite la nota 1: ");
        nota1= Double.parseDouble(entrada.nextLine());
        System.out.println("Digite la nota 2: ");
        nota2= Double.parseDouble(entrada.nextLine());
        System.out.println("Digite la nota 3: ");
        nota3= Double.parseDouble(entrada.nextLine());
        promedio= (nota1+nota2+nota3)/3;
        if(promedio >= 70){
            System.out.println("El alumno esta aprobado con promedio "+ promedio);
        }
        else{
            System.out.println("El alumno esta reprobado con promedio "+ promedio);
        }
    }
}


