package aprendiendojava;

import java.util.Scanner;

public class EjerTema3 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite los dos numeros separdos por espacio: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("la multiplicacion es :"+(x * y));
        System.out.println("***************************");
        System.out.println("***************************");
        
        int z;
        int a;
        String linea;
        System.out.print("Por favor, introduzca el primer número: ");
        linea = sc.next();
        z = Integer.parseInt( linea );
        System.out.print("Introduzca el segundo número: ");
        linea = sc.next();
        a = Integer.parseInt( linea );
        System.out.println("x = " + z);
        System.out.println("y = " + a);
        System.out.println("x + y = " + (z + a));
        System.out.println("x - y = " + (z - a));
        System.out.println("x / y = " + (z / a));
        System.out.println("x * y = " + (z * a));
        System.out.println("***************************");
        System.out.println("***************************");
        
        System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
        double baseImpo = sc.nextDouble();
        System.out.printf("Base Imponible %8.2f\n", baseImpo);
        System.out.printf("IVA            %8.2f\n",(baseImpo * 0.21));
        System.out.printf("********************\n");
        System.out.printf("Total          %8.2f\n",(baseImpo * 1.21));
        System.out.println("***************************");
        System.out.println("***************************");
        
        final double PI = 3.141592654;
        // En lugar de definir una constante se podría usar
        // la constante predefinida Math.PI
        System.out.println("Volumen de un cono");
        System.out.println("Por favor, introduzca la altura (cm): ");
        double h = sc.nextDouble();
        System.out.print("Introduzca el radio (cm): ");
        double r = sc.nextDouble();
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " + v + " cm³");
        System.out.println("***************************");
        System.out.println("***************************");
        
        System.out.println("Clacula nota que falta para pasar el semestre");
        System.out.println("Por favor, introduzca Primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Que nota final quieres sacar: ");
        double finall = sc.nextDouble();
        double nota2 = ((finall * 100) - (nota1 * 40)) / 60;
        System.out.println("Para tener un " + finall + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");

        
        
    }
            
}
