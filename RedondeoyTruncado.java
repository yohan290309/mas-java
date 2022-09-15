
package aprendiendojava;

public class RedondeoyTruncado 
{
    public static void main(String[] args)
    {
    // Literal 1
    double operacionL1 = 789.0/62.0;
    double redondeoL1 = Math.round(operacionL1*100.0)/100.0;
    int truncadoL1 = (int)operacionL1;
    // Literal 2
    double operacionL2 = Math.sqrt(963.0);
    double redondeoL2 = Math.round(operacionL2*100.0)/100.0;
    int truncadoL2 = (int)operacionL2;
    // Literal 3
    double operacionL3 = Math.sqrt(632.0);
    double redondeoL3 = Math.round(operacionL3*100.0)/100.0;
    int truncadoL3 = (int)operacionL3;
    System.out.println("Literal 1");
    System.out.println("Redondeo = ");
    System.out.println(redondeoL1);
    System.out.println("Truncado = ");
    System.out.println(truncadoL1);
    System.out.println("Literal 2");
    System.out.println("Redondeo = ");
    System.out.println(redondeoL2);
    System.out.println("Truncado = ");
    System.out.println(truncadoL2);
    System.out.println("Literal 3");
    System.out.println("Redondeo = ");
    System.out.println(redondeoL3);
    System.out.println("Truncado = ");
    System.out.println(truncadoL3);
    
    // Posición del carácter ‘a’ -> 97 representa el codigo ASCII
    char caracter1 = 97;
    // Posición del carácter ‘?’ -> 63
    char caracter2 = 63;
    // Posición del carácter ‘/’ -> 47
    char caracter3 = 47;
    System.out.println(caracter1);
    System.out.println(caracter2);
    System.out.println(caracter3);
    
    }

}
