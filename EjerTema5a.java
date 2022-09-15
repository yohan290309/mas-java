
package aprendiendojava;
import java.util.Scanner;
public class EjerTema5a
{
//EJERCICIO 24    
   public static void main(String[] args)
   {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.print("Por favor, introduzca la altura de la pirámide:");
        int alturaIntroducida = sc.nextInt();
        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida - 1;
        while (altura <= alturaIntroducida) {
        // inserta espacios
        for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
        }
        // pinta la línea de números
        for (i = 1; i < altura; i++) {
        System.out.print(i);
        }
        for (i = altura; i > 0; i--) {
        System.out.print(i);
        }
        System.out.println();
        altura++;
        espacios--;
        } // while 
System.out.println("**************************************************");
System.out.println("**************************************************");  
 //EJERCICIO 25        
        System.out.print("Introduzca un número entero: ");
        int numeroIntroducido = sc.nextInt();
        int numero = numeroIntroducido;
        int volteado = 0;
        while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        } // while
        System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
System.out.println("**************************************************");
System.out.println("**************************************************");  
 //EJERCICIO 27 
        System.out.println("Introduzca un número entero mayor que 1: ");
        int numeroIntroduci = sc.nextInt();
        int cuenta = 0;
        int suma = 0;
        for (int n = 1; n < numeroIntroduci; n++) {
         if ((i % 3) == 0) {
            System.out.print(i + " ");
            cuenta++;
            suma += i;
            }
        }
        System.out.println("\nDesde 1 hasta " + numeroIntroduci + " hay " + cuenta);
        System.out.println(" múltiplos de 3 y suman " + suma);
System.out.println("**************************************************");
System.out.println("**************************************************");  
 //EJERCICIO 30 
        int primerDia = 0;
        int segundoDia = 0;
        int primeraHora;
        int segundaHora;
        String primerDiaString;
        String segundoDiaString;
        String nombrePrimerDia = "";
        String nombreSegundoDia = "";
        boolean datosCorrectos = true;
        // Recogida de datos /////////////////////////////////////
        do {
        System.out.println("\nPor favor, introduzca la primera hora.");
        System.out.print("Día: ");
        primerDiaString = sc.next();
        System.out.print("Hora: ");
        primeraHora = sc.nextInt();
        switch(primerDiaString) {
        case "lunes":
        case "1":
            primerDia = 1;
            nombrePrimerDia = "lunes";break;
        case "martes":
        case "2":
            primerDia = 2;
            nombrePrimerDia = "martes";break;
        case "miércoles":
        case "3":
            primerDia = 3;
            nombrePrimerDia = "miercoles";break;
        case "jueves":
        case "4":
            primerDia = 4;
            nombrePrimerDia = "jueves"; break;
        case "viernes":
        case "5":
            primerDia = 5;
            nombrePrimerDia = "viernes"; break;
        case "sábado":
        case "6":
            primerDia = 6;
            nombrePrimerDia = "sábado";  break;
        case "domingo":
        case "7":
            primerDia = 7;
            nombrePrimerDia = "domingo"; break;
        default:
             primerDia = 0;
        }
        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.print("Día: ");
        segundoDiaString = sc.next();
        System.out.print("Hora: ");
        segundaHora = sc.nextInt();
        switch(segundoDiaString) {
        case "lunes":
        case "1":  
            segundoDia = 1;
            nombreSegundoDia = "lunes"; break;
        case "martes":
        case "2":
            segundoDia = 2;
            nombreSegundoDia = "martes"; break;
        case "miércoles":
        case "3":
            segundoDia = 3;
            nombreSegundoDia = "miércoles"; break;
        case "jueves":
        case "4":
            segundoDia = 4;
            nombreSegundoDia = "jueves";   break;
        case "viernes":
        case "5":
            segundoDia = 5;
            nombreSegundoDia = "viernes";   break;
        case "sábado":
        case "6":
            segundoDia = 6;
            nombreSegundoDia = "sábado";    break;
        case "domingo":
        case "7":
            segundoDia = 7;
            nombreSegundoDia = "domingo";   break;
        default:
            segundoDia = 0;
        }
        datosCorrectos = true;
        if (segundoDia <= primerDia) {
        System.out.println("El segundo día debe ser posterior al primero.");
        datosCorrectos = false;
        }
        if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println("No se ha introducido correctamente el día de la semana.");                
        System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
        datosCorrectos = false;
        }
        if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        System.out.println("Las horas válidas están entre 0 y 23.");
        datosCorrectos = false;
        }
        } while (!datosCorrectos);
        // Fin de la recogida de datos ///////////////////////////
        System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
        System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
        System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");                
                
                
   } 
}
