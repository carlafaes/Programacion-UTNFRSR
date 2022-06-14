import java.util.Scanner;

public class clase6 {

    public static void main(String[] args) throws Exception {
        //tipos primitivos booleanos
        boolean varBolean = true;
        System.out.println("varBolean = " + varBolean);

        if(varBolean){
            System.out.println("varBolean es verdadero");
        }
        else{
            System.out.println("varBolean es falso");
        }

        //algoritmo ¿Es mayor de edad?
        var edad = 28;
        //var adulto= edad >= 18;

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("No es mayor de edad");  
        }



        //conversion de tipos primitivos
        var _edad= Integer.parseInt("25");
        System.out.println("_edad = " + _edad);

        var valorPI= Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        edad= Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);

        //conversion de tipos primitivos
        var edadTexto= String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var frasechar="programadores".charAt(0);//charAt nos regresa el caracter en la posicion indicada
        System.out.println("charAt(primer posicion) = " + frasechar);
        
    }

}



