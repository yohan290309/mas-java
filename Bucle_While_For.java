package aprendiendojava;

import java.util.Scanner;
public class Bucle_While_For 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
        System.out.println("Para terminar, introduzca un número negativo.");
        
        int numIntro = 0;
        int cuentaNum = 0;
        int suma = 0;
        
        while (numIntro >= 0)
        {
            numIntro = sc.nextInt();
            cuentaNum++;
            suma += numIntro;
        }
        System.out.println("Has introducido " + (cuentaNum - 1) + " números positivos.");
        System.out.println("La suma total de ellos es " + (suma - numIntro));
    System.out.println("*******************************************"); 
    System.out.println("*******************************************");   
        int numero;
        do{
            System.out.println("Digite el numero: ");
            numero = sc.nextInt();
            if (numero % 2 == 0)
            {
               System.out.println("Que bonito es le numero" + numero); 
            }else
            {
               System.out.println("No me gustan los Impares ");
            }
        }while (numero % 2 ==0);
        
    }
}
