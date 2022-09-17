package programacion_II.clase2;

import javax.swing.JOptionPane;

/*Ejercicio 2: Leer un numero e indicar si es positivo o negativo. El proceso de repetira hasta que se introduzca un cero */
public class ejercicio2 {
    public static void main(String[] args){
        var numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero >0){
                JOptionPane.showMessageDialog(null, "el numero "+numero+" es POSITIVO");
            }
            else{
                JOptionPane.showMessageDialog(null, "el numero"+numero+" es NEGATIVO");
            }
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"El numero "+numero+" finaliza el programa");
    }
    
}
