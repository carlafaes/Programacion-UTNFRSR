package programacionI;
import java.util.Scanner;

public class clase10Ejercicios {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite un numero entre 0 y 10: ");
        var calificacion= Integer.parseInt(entrada.nextLine());
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion <= 9){
            System.out.println("B");
        }
        else if(calificacion >= 7 && calificacion <= 8){
            System.out.println("C");
        }
        else if(calificacion >= 6 && calificacion <= 7){
            System.out.println("D");
        }
        else if(calificacion >= 5 && calificacion <= 6){
            System.out.println("E");
        }
        else if(calificacion >= 0 && calificacion <= 4){
            System.out.println("F");
        }
        else{
            System.out.println("Calificacion no valida");
        }


        //mismo ejercicio con sentencia switch
        Scanner entrada2= new Scanner(System.in);
        System.out.println("Digite un numero entre 0 y 10: ");
        var calificacion2= Integer.parseInt(entrada2.nextLine());

        switch(calificacion2){
            case 9:
            case 10:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Calificacion no valida");
                break;
        }
        System.out.println("La calificacion es "+ calificacion2);
    }
}
