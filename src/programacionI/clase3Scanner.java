package programacionI;
import java.util.Scanner;

public class clase3Scanner{//necesario para que sea ejecutable
    public static void main(String[] args) throws Exception {//necesario para que sea ejecutable
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el titulo: ");
            String titulo= scanner.nextLine();//lee una linea de texto
            System.out.println("Proporciona el autor : ");//imprime un mensaje
            String autor= scanner.nextLine();
            System.out.println(titulo + " fue escrito por " + autor);
        }

    }
}