
package aprendiendojava;

public class EjerTema2 
{
    public static void main (String [] args)
    {
       int x = 144;
       int y = 999;
       System.out.println("x = " + x);
       System.out.println("y = " + y);
       System.out.println("x + y = " + (x + y));
       System.out.println("x - y = " + (x - y));
       System.out.println("x / y = " + ((float)x / (float)y));
       System.out.println("x * y = " + (x * y)); 
       System.out.println("************************"); 
       System.out.println("************************"); 
       String nombre = "Jonathan Andres R";
       String direccion = "Larios, 180 - Málaga";
       String telefono = "Tel: 555 12 34 56";
       System.out.println(nombre);
       System.out.println(direccion);
       System.out.println(telefono);
       System.out.println("************************"); 
       System.out.println("************************"); 
       double euros = 6.00;
       int pesos = (int) (euros * 4320);
       System.out.print(euros + " euros son " + pesos + " pesos.");
       System.out.println("************************"); 
       System.out.println("************************"); 
       int pesoss = 10000;
       double euross = pesoss / 4320;
       System.out.println(pesoss + " pesos son " + euross + " euros.");
       // Para mostrar dos decimales se puede usar "printf"
       // en lugar de "print" o "println"
       System.out.printf("%d pesos son %.2f euros.\n", pesoss, euross);
       System.out.println("************************"); 
       System.out.println("************************"); 
       double baseImponible = 22.75;
       System.out.printf("Base imponible %8.2f\n", baseImponible);
       System.out.printf("IVA %8.2f\n", (baseImponible * 0.21));
       System.out.printf("-----------------------\n");
       System.out.printf("Total %8.2f\n", (baseImponible * 1.21));
       System.out.println("************************"); 
       System.out.println("************************"); 
       char primeraLetra = 'a';
       char ultimaLetra = 'z';
       String palabra = "abecedario";
       System.out.println(primeraLetra + "" + ultimaLetra + palabra);
       System.out.println("************************"); 
       System.out.println("************************"); 
       char l1 = 's';
       char l2 = 'a';
       char l3 = 'l';
       char l4 = 'u';
       char l5 = 'd';
       // La siguiente línea da error porque el resultado de sumar variables
       // de tipo carácter es un número entero.
       // String palabra = l1 + l2 + l3 + l4 + l5;
       // Se soluciona concatenando al principio la cadena vacía.
       String palabras = "" + l1 + l2 + l3 + l4 + l5;
       System.out.println(palabras);
       
    }        
}
