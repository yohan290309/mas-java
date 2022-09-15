//Calculadora simple
package aprendiendojava;

import java.util.Scanner;
public class Condicionales1 
{
   public static void main (String [] args)
   {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el primer número");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número");
            int num2 = sc.nextInt();
            System.out.println("Ingrese el nombre de la operación");
            String operacion = sc.next();
            int resultado;
     
            switch (operacion) 
            {
                case "sumar":
                resultado = num1 + num2;
                System.out.println("La suma es = " + resultado);
                break;
                case "restar":
                resultado = num1 - num2;
                System.out.println("La resta es = " + resultado);
                break;
                case "multiplicar":
                resultado = num1 * num2;
                System.out.println("La multiplicación es = " + resultado);
                break;
                default:
                System.out.println("La operación ingresada no es válida");
                break;
            }  
    //comparar cadenas
    System.out.println("Ingrese una cadena");
    String cadena1 = sc.next();
    String cadena2 = "Pedro";
    //Comparación de cadenas
    // con ".equals()"
    boolean expresion = cadena1.equals(cadena2);
    if(expresion)
    {
        System.out.println("Las cadenas son iguales");
    }else
    {
        System.out.println("Las cadenas no son iguales"); 
    }
    
   } 
}
