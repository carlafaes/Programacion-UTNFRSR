public class clase7 {
    public static void main(String[] args) throws Exception {
        //operadores de asignacion
        int varNum1=1, varNum2=4;//asignacion de valores
        int varNum3= varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1;
        System.out.println("suma de varNum1 = " + varNum1);

        varNum1 -= 1;
        System.out.println("resta de varNum1 = " + varNum1);

        varNum1 *= 1;
        System.out.println("multiplicacion de varNum1 = " + varNum1);

        varNum1 /= 1;
        System.out.println("division de varNum1 = " + varNum1);

        varNum1 %= 1;
        System.out.println("modulo de varNum1 = " + varNum1);
    }
}