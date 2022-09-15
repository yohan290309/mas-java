
package aprendiendojava;

public class ColoreandoTexto 
{
  public static void main (String [] args)
  {
        System.out.println("\033[33m mandarina");
        System.out.println("\033[32m hierba");
        System.out.println("\033[31m tomate");
        System.out.println("\033[37m sábanas");
        System.out.println("\033[36m cielo");
        System.out.println("\033[35m nazareno");
        System.out.println("\033[34m mar");
        
        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
        System.out.println("│ Código  │ Color    │ Código │ Color       │");
        System.out.println("├────────┼───────────┼────────┼────────────────┤");
        System.out.print("│ 30      │\033[30m negro  \033[39;49m │");
        System.out.println(" 90     │\033[90m negro claro \033[39;49m │");
        System.out.print("│ 31      │\033[31m rojo  \033[39;49m │");
        System.out.println(" 91     │\033[91m rojo claro \033[39;49m │");
        System.out.print("│ 32      │\033[32m verde  \033[39;49m │");
        System.out.println(" 92     │\033[92m verde claro \033[39;49m │");
        System.out.print("│ 33      │\033[33m amarillo  \033[39;49m │");
        System.out.println(" 93     │\033[93m amarillo claro  \033[39;49m│");
        System.out.print("│ 34      │\033[34m azul  \033[39;49m │");
        System.out.println(" 94     │\033[94m azul claro  \033[39;49m │");
        System.out.print("│ 35      │\033[35m morado  \033[39;49m │");
        System.out.println(" 95     │\033[95m morado claro  \033[39;49m │");
        System.out.print("│ 36      │\033[36m cian  \033[39;49m │");
        System.out.println(" 96     │\033[96m cian claro  \033[39;49m │");
        System.out.print("│ 37      │\033[37m blanco  \033[39;49m │");
        System.out.println(" 97     │\033[97m blanco claro  \033[39;49m │");
        System.out.println("└────────┴───────────┴────────┴────────────────┘");
        //Esta parte es para alinear las salidas %-10s Izquierda %10s Derecha
        System.out.println(" Artículo Precio/caja Nº cajas");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s %8.2f %6d\n", "peras", 2.75, 120);
        System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
  }        
}
