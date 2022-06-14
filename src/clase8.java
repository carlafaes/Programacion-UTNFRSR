public class clase8 {
    public static void main(String[] args) throws Exception {
        //operador de negacion
        var varC= true;
        var varD= !varC;
        System.out.println("varD = " + varD);
        System.out.println("varC = " + varC);

        //operadores unarios de incremento:Preincremento
        var varE=9;//se va a modificar su valor
        var varF= ++varE;
        //Primero se incrementa el valor de la variable y luego se lee
        System.out.println("varE = " + varE);//se incrementa en la unidad
        System.out.println("varF = " + varF);//va a sumar uno

    }
}
