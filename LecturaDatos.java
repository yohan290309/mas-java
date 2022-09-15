package aprendiendojava;
import java.util.Scanner;
public class LecturaDatos 
{   //lectura de datos por teclado, Scanner
    public static void main(String[] args)
    {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        nombre = sc.next();
        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
        System.out.print("*******************************");
        System.out.println("*******************************");
    // lectura de numeros    
        String linea;
        System.out.print("Por favor, introduce un número: ");
        linea = sc.next();
        int primerNumero;
        primerNumero = Integer.parseInt(linea);//convierte a int el String
        System.out.print("introduce otro, por favor: ");
        linea = sc.next();
        int segundoNumero;
        segundoNumero = Integer.parseInt( linea );//convierte a int el String
        int total;
        total = (2 * primerNumero) + segundoNumero;
        System.out.print("El primer número introducido es " + primerNumero);
        System.out.println(" y el segundo es " + segundoNumero);
        System.out.print("El doble del primer número más el segundo es ");
        System.out.print(total);
        System.out.println("*******************************");
        System.out.println("*******************************");
    //Agregar al scanner dos variables en una sola linea
        System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
        String nombr = sc.next();
        int eda = sc.nextInt();
        System.out.println("Tu nombre es " + nombr + " y tu edad es " + eda);
        System.out.println("*******************************");
        System.out.println("*******************************");
    //Agregar al scanner 3 variables en una sola linea y sacar promedio
        System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double media = (x1 + x2 + x3) / 3;
        System.out.println("La media de esos tres números es " + media);
        System.out.println("*******************************");
        System.out.println("*******************************");

    }
    
}
