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

        //Postincremento(el simbolo va despues del valor)
        var varG= 3;
        var varH=varG++;//primero el valor de la variable y luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //operadores unarios de decremento:Predecremento
        var varI=9;//se va a modificar su valor
        var varJ= --varI;
        //Primero se decrementa el valor de la variable y luego se lee
        System.out.println("varI = " + varI);//se decrementa en la unidad
        System.out.println("varJ = " + varJ);//va a restar uno

        //Postdecremento(el simbolo va despues del valor)
        var varK= 3;
        var varL=varK--;//primero el valor de la variable y luego el decremento
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);

        //operadores de igualdad y relacionales
        var aNum=5;
        var bNum= 4;
        var cNum=(aNum==bNum);//false
        System.out.println("aNum = " + aNum);

        var dNum= aNum != bNum;//true
        System.out.println("dNum = " + dNum);
    }
}
