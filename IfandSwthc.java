//Programa que dice si numero es positivo o negativo
package aprendiendojava;

import java.util.Scanner;
public class IfandSwthc 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero entero: ");
        int num = sc.nextInt();
        if (num < 0)
        {
          System.out.println("El numero "+num+ "es negativo");  
        }else
        {
          System.out.println("El numero "+num+ "es positivo");    
        }    
    System.out.println("**********************************"); 
    System.out.println("**********************************");  
    System.out.println("Adivina el numero que estoy pensando");
    System.out.println("Intruduce un numero entre 1 y el 100");
        int num1 = sc.nextInt();
        if((num1 < 1)||(num1 > 100))
        {
          System.out.println("El número introducido debe estar en el intervalo 1 - 100.");
          System.out.print("Tienes otra oportunidad, introduce un número: ");
          int adivi = sc.nextInt();
          num1 = adivi;  
        }
        if (num1 == 24) 
        {
            System.out.println("¡Enhorabuena!, ¡has acertado!");
        } else
        {
            System.out.println("Lo siento, ese no es el número que estoy pensando.");
        }
    System.out.println("**********************************"); 
    System.out.println("**********************************");  
    boolean a = true;
    boolean b = false;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("a && b = " + (a && b));
    System.out.println("a || b = " + (a || b));
    System.out.println("!a = " + !a);
    System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
    System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
    System.out.print("Por favor, introduzca un numero de mes: ");
    System.out.println("**********************************"); 
    System.out.println("**********************************");  
    
    System.out.print("Por favor, introduzca un numero de mes: ");
    int mes = sc.nextInt();
    String nombreDelMes;
    switch (mes) {
    case 1:
    nombreDelMes = "enero";
    break;
    case 2:
    nombreDelMes = "febrero";
    break;
    case 3:
    nombreDelMes = "marzo";
    break;
    case 4:
    nombreDelMes = "abril";
    break;
    case 5:
    nombreDelMes = "mayo";
    break;
    case 6:
    nombreDelMes = "junio";
    break;
    case 7:
    nombreDelMes = "julio";
    break;
    case 8:
    nombreDelMes = "agosto";
    break;
    case 9:
    nombreDelMes = "septiembre";
    break;
    case 10:
    nombreDelMes = "octubre";
    break;
    case 11:
    nombreDelMes = "noviembre";
    break;
    case 12:
    nombreDelMes = "diciembre";
    break;
    default://cuando la variable no coincide
    nombreDelMes = "no existe ese mes";
    }
    System.out.println("Mes " + mes + ": " + nombreDelMes);
    System.out.println("**********************************"); 
    System.out.println("**********************************"); 
    
    System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println(" ----------------");
    System.out.println(" 1. Cuadrado");
    System.out.println(" 2. Rectángulo");
    System.out.println(" 3. Triángulo");
    System.out.print("\n Elija una opción (1-3): ");
    int opcion = sc.nextInt();
    double lado;
    double base;
    double altura;
    switch (opcion)
        {
            case 1:
            System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
            lado = sc.nextDouble();
            System.out.println("\nEl área del cuadrado es " + (lado * lado) + " cm2");
            break;
            case 2:
            System.out.print("\nIntroduzca la base del rectángulo en cm: ");
            base = sc.nextDouble();
            System.out.print("Introduzca la altura del rectángulo en cm: ");
            altura = sc.nextDouble();
            System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
            break;
            case 3:
            System.out.print("\nIntroduzca la base del triángulo en cm: ");
            base = sc.nextDouble();
            System.out.print("Introduzca la altura del triángulo en cm: ");
            altura = sc.nextDouble();
            System.out.println("El área del triángulo es " + ((base * altura) / 2) + " cm2");
            break;
            default:
            System.out.print("\nLo siento, la opción elegida no es correcta.");
        }
    }
}
