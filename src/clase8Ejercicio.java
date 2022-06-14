import java.util.Scanner;

public class clase8Ejercicio {
    public static void main(String[] args) throws Exception {
          //Ejercicio Reactangulo
        //Se solicita calcular el area y la perimetro de un rectangulo,para esto deberemos crear variables: Alto(int) y ancho(int)
        //El usuario debe proporcionar los valores del alto y el ancho
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el alto del rectangulo: ");
        int alto= Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el ancho del rectangulo: ");
        int ancho= Integer.parseInt(entrada.nextLine());
        //Calcular el area
        int area= alto*ancho;
        int perimetro=(alto+ancho)*2;
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);


        //ejercicio 4
        Scanner entrada2=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num1=Integer.parseInt(entrada2.nextLine());
        System.out.println("Digite otro numero: ");
        int num2=Integer.parseInt(entrada2.nextLine());
        System.out.println("El numero mayor es: ");
        System.out.println(num1 > num2 ? num1 : num2);

    }
}
