//Ejemplos libro apredejava tema1.
package aprendiendojava;

public class EjerTema1 
{
    public static void main(String [] args )
    {
        System.out.printf("%-10s %s\n", "computer", "ordenador");
        System.out.printf("%-10s %s\n", "student", "alumno\\a");
        System.out.printf("%-10s %s\n", "cat", "gato");
        System.out.printf("%-10s %s\n", "penguin", "pingüino");
        System.out.printf("%-10s %s\n", "machine", "máquina");
        System.out.printf("%-10s %s\n", "nature", "naturaleza");
        System.out.printf("%-10s %s\n", "light", "luz");
        System.out.printf("%-10s %s\n", "green", "verde");
        System.out.printf("%-10s %s\n", "book", "libro");
        System.out.printf("%-10s %s\n", "pyramid", "pirámide");
        System.out.println("******************************");
        System.out.printf("");
        System.out.println("******************************");
        System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
        System.out.println("======\t=======\t======\t=======\t=======");
        System.out.println("PROG\tPROG\tPROG\tPROG \tSIN");
        System.out.println("PROG\tPROG\tPROG\tPROG\tSIN");
        System.out.println("ED\tSIN\tSIN\tLM\tBDATO");
        System.out.println("FOL\tSIN\tSIN\tLM\tBDATO");
        System.out.println("FOL\tBDATO\tED\tBDATO\tED");
        System.out.println("FOL\tBDATO\tED\tBDATO\tED");   
        System.out.println("******************************");
        System.out.printf("el mismo cambiando color");
        System.out.println("******************************");
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println("======\t=======\t======\t======\t=======");
        System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(celeste + "ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(naranja + "FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
        System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
        System.out.println("\033[34m");
        System.out.println("      *");
        System.out.println("     ***");
        System.out.println("    *****");
        System.out.println("   *******");
        System.out.println("  *********");
        System.out.println("      *");
        System.out.println("     * *");
        System.out.println("    *   *");
        System.out.println("   *     *");
        System.out.println("  *********");
        System.out.println("  *********");
        System.out.println("   *     *");
        System.out.println("    *   *");
        System.out.println("     * *");
        System.out.println("      *");
               
    }
    
}
