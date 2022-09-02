package programacionI;
//En un almacen se hace un 20 MOD de descuento a los clientes cuya compra supere los $100. ¿Cual sera la cantidad que pagara una persona por su compra?

import java.util.Scanner;

public class clase11Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        double compra, descuento, precio_final;
        System.out.println("Digite la cantidad a pagar: ");
        compra= Double.parseDouble(entrada.nextLine());
        if(compra > 100){
            descuento = compra * 0.2;
        }
        else{
            descuento = 0;
        }
        precio_final= compra - descuento;
        System.out.println("El precio final es "+ precio_final);
    }
}
