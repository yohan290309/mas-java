
package aprendiendojava;

import java.util.Scanner;

public class ConversionDatos 
{
    public static void main(String[] args)
    {
        String cadena = "35";
        int entero = 45;
        double decimal = 55;
        // Conversión de cadena a entero
        int enteroConvertido = Integer.parseInt(cadena);
        // Conversión de cadena a decimal
        double decimalConvertido = Double.parseDouble(cadena);
        // Conversión de entero a cadena
        String cadenaConvertida1 = String.valueOf(entero);
        // Conversión de decimal a cadena
        String cadenaConvertida2 = String.valueOf(decimal);
        System.out.println(enteroConvertido);
        System.out.println(decimalConvertido);
        System.out.println(cadenaConvertida1);
        System.out.println(cadenaConvertida2);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite el numero: ");
        n = sc.nextInt();
        System.out.println(n);
        /*
        Función Tipo de dato
        nextInt() Entero (int)
        nextDouble Decimal (double)
        nextLine Cadena de caracteres (String)
        */
        
        
    }
}
