package programacionI;


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

        var cadenaA="Hello";
        var cadenaB="Bye";
        var cadenaC= (cadenaA==cadenaB);//false
        System.out.println("cadenaC = " + cadenaC);

        var cadenaF= cadenaA.equals(cadenaB);//false
        System.out.println("cadenaF = " + cadenaF);

        var hVar= aNum != bNum;//true <= >= < > ==
        System.out.println("hVar = " + hVar);

        if(aNum % 2 == 0){
            System.out.println("aNum es par");
        }else{
            System.out.println("aNum es impar");
        }

        //operador condicional and
        var valorA=7;
        var valorMinimo=0;
        var valorMaximo=10;
        var respuesta= valorA >= 0 && valorA <= 10;

        if(respuesta){
            System.out.println("Esta dentro del rango establecido");
        }
        else{
            System.out.println("Esta fuera del rango establecido");
        }

        //operador condicional or
        var vacaciones=false;
        var diaLibre=false;

        if(vacaciones || diaLibre){
            System.out.println("Puede trabajar");
        }else{
            System.out.println("No puede trabajar");
        }

        //operador ternario
        var varM=(5 < 4)? "verdadero" : "falso";
        System.out.println("varM = " + varM);

        var varN=7;
        var varO=(varN % 2 == 0)? "es par" : "es impar";
        System.out.println("varO = " + varO);

        var x=5;
        var y=10;
        var z=++x + y--;
        System.out.println("z = " + z);
        System.out.println("y ="+y);
        System.out.println("x ="+x);

        var solucionAritmetica= 4+5*6/3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica=(4+5)*6/3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

}
}
