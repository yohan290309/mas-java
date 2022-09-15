
package aprendiendojava;

import java.util.Scanner;

public class Ciclosfor 
{
    public static void main (String [] args)
    {
        for (int i=1; i<50; i=i+1)
        {
            System.out.println("********************");
            System.out.println("***Jonathan Andres***");
            System.out.println("********************");
        }
        //Repetir con Ciclo while
        int cont = 1;
        while(cont <= 50)
        {
            System.out.println("********************************");
            System.out.println("**** Jesús Ormaza ****");
            System.out.println("********************************");
            cont = cont+1;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nombre");
        String nombre = sc.next();
        while(!nombre.equals("Juan"))//.equals verifica compara Strings
        {
            System.out.println("Nombre incorrecto");
            System.out.println("Ingresa un nombre");
            nombre = sc.next();
        }
        
        System.out.println("Ingresa un numero");
        double numero = sc.nextDouble();
        while(numero < 0 )
        {
            System.out.println("Número no válido");
            System.out.println("Ingrese un número");
            numero = sc.nextDouble();
        }    
        double resultado = Math.sqrt(numero);
        System.out.println(resultado);
        
        //alimentar vectores por grandes cantidades
        int vec [] = new int [50];
        for (int i = 0; i<=49; i=i+1)
        {
            vec[i]=i+1;
            System.out.println(vec[i]);
        }
        System.out.println("************************");
        
        //Imprime los numero en forma Decendente
        int vecc [] = new int [100];
        for (int i = 0; i<=99; i=i+1)
        {
            vecc[i]=100-i;
            System.out.println(vecc[i]);
        }
    }
}
