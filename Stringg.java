package aprendiendojava;


public class Stringg   
 
{
        
    public static void main(String[] args)

    {
        String mensaje = "Introduccion a la logica a \n de programación";
        System.out.println(mensaje);
        String mens1 = "Hola";
        String mens2 = "Mundo";
        // Concatenando "Hola" + "mundo"
        String resultado = mens1.concat(mens2);//Forma 1
        System.out.println(resultado);
        System.out.println(mens1 + mens2);// Forma 2
        String resultadoo = mens1.replace("a", "e");//.replace cambia palabras
        System.out.println(resultadoo);
        String resultadooo = mens1.replace("a", "");
        System.out.println(resultadooo);//.replace tambien elimina letra
        String men3 = "Lorem ipsum dolor sit ament";
        String cambio = men3.replace("o", "n");
        System.out.println(cambio);
        String men4 = "ALIQUAM GRAVIDA ARCU UT SOLLICITUDIN ORNARE IN.";
        String minuscula = men4.toLowerCase();
        System.out.println(minuscula);
        // cambia a minuscula e.toLowerCase();
        // cambia a mayuscula e.toUpperCase();
        // Salidas formateadas
        System.out.printf("El número %d no tiene decimales.\n", 21);
        System.out.printf("El número %f sale con decimales.\n", 21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
    
    }
}
