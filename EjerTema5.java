package aprendiendojava;
import java.util.Scanner;
public class EjerTema5 
{
    public static void main(String[] args)
    {
//EJERCICIO 01
        for (int i=0; i<=100; i=i+10)
        {
            System.out.println(i);
        }
System.out.println("********************************");
System.out.println("********************************");
        int i=0;
        while(i <= 100)
        {
            System.out.println(i);
            i= i + 20;
        }
System.out.println("********************************");
System.out.println("********************************");
        int j=0;
        do
        {
            System.out.println(j);
            j= j + 20;
        }while(j <= 100);
System.out.println("********************************");
System.out.println("********************************");
        for (int n=320; n>=160; n=n-20)
        {
            System.out.println(n);
        }
System.out.println("********************************");
System.out.println("********************************");
//EJERCICIO7
        int intentos = 4;
        int numeroIntro;
        boolean acertado = false;
        do
        {
           System.out.println("Introduza la clave: ");
           Scanner sc = new Scanner(System.in);
           numeroIntro =sc.nextInt();
           if(numeroIntro == 8888)
           {
               acertado = true;
           }else
           {
               System.out.println("Clave Incorrecta: ");
           }
           intentos--;
        }while((intentos > 0) && (!acertado));
        if (acertado)
        {
            System.out.println("Ha abiero la caja: ");
        }else
        {
          System.out.println("Lo siento, ha agotado las 4 oportunidades.");  
        }
System.out.println("********************************");
System.out.println("********************************");
//EJERCICIO9        
        int numeroDeDigitos = 1, n, numeroIntroducido;
        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        Scanner scc = new Scanner(System.in);
        numeroIntroducido = scc.nextInt();
        n = numeroIntroducido;
        while (n > 10) {
        n /= 10;
        numeroDeDigitos++;
        }
        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
System.out.println("********************************");
System.out.println("********************************");
//EJERCICIO11
        System.out.print("Introduzca un número: ");
        Scanner cc = new Scanner(System.in);
        int numIntroducido = cc.nextInt();
        for (int h = numIntroducido; h < numIntroducido + 5; h++) {
        System.out.printf("%4d %6d %8d\n", h, h * h, h * h * h);
        }
System.out.println("********************************");
System.out.println("********************************");
//EJERCICIO19   
        Scanner ca = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = ca.nextInt();
        System.out.print("Introduzca el carácter de relleno: ");
        String relleno = ca.next();
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;
            while (planta <= alturaIntroducida) {
            // inserta espacios
                for (int o = 1; o <= espacios; o++) {
                    System.out.print(" "); 
                }
                // pinta la línea
                for (int g = 1; g <= longitudDeLinea; g++) {
                    System.out.print(relleno);
                }
                System.out.println();
                planta++;
                espacios--;
                longitudDeLinea += 2;
            }   
System.out.println("********************************");
System.out.println("********************************");
//EJERCICIO20          
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        Scanner caa = new Scanner(System.in);
        int alturaIntrod = caa.nextInt();
        System.out.print("Introduzca el carácter de relleno: ");
        String relle = caa.next();
        int alt = 1;
        int m = 0;
        int espaciosPorDelante = alturaIntrod - 1;
        int espaciosInternos = 0;
        while (alt < alturaIntrod){ 
            // inserta espacios delante
            for (m = 1; m <= espaciosPorDelante; m++) {
            System.out.print(" ");
            }
            // pinta la línea
            System.out.print(relle);
            for (m = 1; m < espaciosInternos; m++) {
            System.out.print(" ");
            }
            if (alt>1) {
            System.out.print(relle);
            }
            System.out.println();
            alt++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////
        // base de la pirámide
        for (m = 1; m < alt*2; m++) {
        System.out.println(relle);
        }
    }    
}

