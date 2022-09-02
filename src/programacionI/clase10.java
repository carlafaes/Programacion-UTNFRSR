package programacionI;
import java.util.Scanner;

public class clase10 {
    public static void main(String[] args) throws Exception {
        var condicion= false;
        if(condicion){
            System.out.println("condicion es verdadera");
        }else{
            System.out.println("condicion es falsa");
        }

        var numero= 2;
        var numeroTexto="Numero desconocido";
        if(numero == 1){
            numeroTexto="Uno";
        }
        else if(numero == 2){
            numeroTexto="Dos";
        }
        else if(numero == 3){
            numeroTexto="Tres";
        }
        else if(numero == 4){
            numeroTexto="Cuatro";
        }
        else{
            numeroTexto="Numero no encontrado";
        }
        System.out.println("El numero es: " + numeroTexto);

        //ejercicio 2-calculo de las estaciones del año
        Scanner entrada2= new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes=Integer.parseInt(entrada2.nextLine());
        var estacion= "Estacion desconocida";
        if(mes == 1 || mes == 2 || mes == 3){
            estacion="Verano";
        }
        else if(mes == 4 || mes == 5 || mes == 6){
            estacion="Otoño";
        }
        else if(mes == 7 || mes == 8 || mes == 9){
            estacion="Invierno";
        }
        else if(mes == 10 || mes == 11 || mes == 12){
            estacion="Primavera";
        }
        else{
            estacion="Mes no encontrado";
        }
        System.out.println("La estacion es: " + estacion);

        //ejercicio 3-sentencia de control switch
        var numero3=3;
        var numeroTexto2="Valor desconocido";
        switch(numero3){
            case 1:
                numeroTexto2="Uno";
                break;
            case 2:
                numeroTexto2="Dos";
                break;
            case 3:
                numeroTexto2="Tres";
                break;
            case 4:
                numeroTexto2="Cuatro";
                break;
            case 5:
                numeroTexto2="Cinco";
                break;
        }
        System.out.println("El numero es: " + numeroTexto2);

        //ejercicio 4-sentencia de control switch estaciones del año
        Scanner entrada4= new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes2= Integer.parseInt(entrada4.nextLine());
        var estacion2="Estacion desconocida";
        switch(mes2){
            case 1: case 2: case 3:
                estacion2="Verano";
                break;
            case 4: case 5: case 6:
                estacion2="Otoño";
                break;
            case 7: case 8: case 9:
                estacion2="Invierno";
                break;
            case 10: case 11: case 12:
                estacion2="Primavera";
                break;
        }
        System.out.println("La estacion es: " + estacion);

        
    }
}
