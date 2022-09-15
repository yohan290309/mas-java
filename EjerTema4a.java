package aprendiendojava;
import java.util.Scanner;

public class EjerTema4a
{
    public static void main(String[] args)
    {
//EJERCICIO 25        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura = sc.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        int anchura = sc.nextInt();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        boolean conEscudo = sc.hasNextBoolean();
        String escudoCadena;
        float precioEscudo;
        if (conEscudo) {
            escudoCadena = "Con escudo";
            precioEscudo = 0; 
        }else{
            escudoCadena = "Sin escudo";
            precioEscudo = 0; 
        }
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
        System.out.printf("%s: %5.2f €\n", escudoCadena, precioEscudo);
        System.out.printf("Gastos de envío: %5.2f €\n", 3.25);
        System.out.printf("Total: %5.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);
    System.out.println("**********************************");
    System.out.println("**********************************");
//EJERCICIO 26 
    Scanner scc = new Scanner(System.in);
    System.out.println("Venta de entradas CineCampa");
    System.out.print("Número de entradas: ");
    int entradas = scc.nextInt();
    System.out.print("Día de la semana: ");
    String dia = scc.nextLine();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
//Defino vatribles    
    boolean tieneTarjeta = scc.hasNextBoolean();
    int entradasIndividuales = entradas;
    double precioEntradaIndividual = 8;
    int entradasDePareja = 0;
    double total = 0;
    double descuento = 0;
    double aPagar = 0;
        switch (dia) {
            case "miércoles":
            case "miercoles":
                precioEntradaIndividual = 5;
            case "jueves":
                entradasDePareja = entradas / 2;
                entradasIndividuales = entradas % 2;
            default:
        }
    total = precioEntradaIndividual * entradasIndividuales;
    total += 11 * entradasDePareja;
    if(tieneTarjeta) {
        descuento = total * 0.1;
    }
    aPagar = total - descuento;
    System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");
    if (entradasDePareja > 0) {
        System.out.printf("Entradas de pareja %2d\n", entradasDePareja);
        System.out.printf("Precio por entrada de pareja %5.2f €\n", 11.0);
    }
    if (entradasIndividuales > 0) {
        System.out.printf("Entradas individuales %2d\n", entradasIndividuales);
        System.out.printf("Precio por entrada individual %5.2f €\n", precioEntradaIndividual);
    }
    System.out.printf("Total %5.2f €\n", total);
    System.out.printf("Descuento %5.2f €\n", descuento);
    System.out.printf("A pagar %5.2f €\n", aPagar);
    
    
    
        

    }
}
