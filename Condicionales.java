
package aprendiendojava;

import java.util.Scanner;
public class Condicionales
{
    
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa un número");
    int numEntero = sc.nextInt();
    boolean expresion1 = (numEntero > 0) & numEntero <=50;
    boolean expresion2 = (numEntero < 0) | numEntero >= 20;
    boolean expresion3 = (numEntero < -6) | numEntero > 0;
    boolean expresion4 = (numEntero < 0) | numEntero ==34;
    System.out.println(expresion1);
    System.out.println(expresion2);
    System.out.println(expresion3);
    System.out.println(expresion4);
    
    System.out.println("Ingresa dividendo");
    double dividendo = sc.nextDouble();
    System.out.println("Ingresa el divisor");
    double divisor = sc.nextDouble();
    Boolean expression = (divisor != 0);
        boolean expresion = false;
        
    if(expresion)
        {
        double division = dividendo / divisor;
        
        }
        boolean division = false;
        System.out.println(division);
        
    System.out.println("Ingresa dividendo");
    double dividendoo = sc.nextDouble();
    System.out.println("Ingresa el divisor");
    double divisorr = sc.nextDouble();
    if(divisor != 0){
    double divisionn = dividendoo / divisorr;
    System.out.println(divisionn);
    }else{
    System.out.println("Divisor no válido");
    }    
        
    }
}

