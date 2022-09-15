
package aprendiendojava;

import java.util.Scanner;

public class EjerTema4 
{   //NUMERO1
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un dia de la semana: ");
        String dia = sc.next();
        String diaa = dia.toLowerCase();//convier a minusculas
        switch(diaa)
        {
            case "lunes":
                System.out.println("Programación");break;
            case "martes":
                System.out.println("Ingles");break;
            case "miercoles":
                System.out.println("Mate");break;
            case "jueves":
                System.out.println("quim");break;
            case "viernes":
                System.out.println("Mate");break;
            default:
                System.out.println("dia no es correcto");break;
       }
    System.out.println("**************************");
    System.out.println("**************************");
    // NUMERO2
          System.out.println("Digite la hora: ");
          int hora = sc.nextInt();
          if ((hora >= 6) && (hora <= 12))
          {
                 System.out.println("Buenos días");
          }
          if ((hora >= 13) && (hora <= 20))
          {
                System.out.println("Buenas tardes");
          }
          if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0)))
          {
             System.out.println("Buenas noches");
          }
            if ((hora >= 24) || (hora < 0))
          {
                System.out.println("La hora introducida no es correcta.");
          }
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO4
        int sueldoSemana;
        System.out.println("Digite numero de horas trabajadas a la semana: ");
        int horasSemana = sc.nextInt();
        if (horasSemana <= 40)
        {
            sueldoSemana = 12 * horasSemana;
        }else
        {
            sueldoSemana = (40 *12)+((horasSemana - 40)*16);
        }
        System.out.println("El sueldo semanal es de " + sueldoSemana + " euros");
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO8
        System.out.println("Este programa calcula la media de tres notas.");
        System.out.print("Por favor, introduzca la primera nota: ");
        Double nota1 = sc.nextDouble();
        System.out.print("Ahora introduzca la segunda nota: ");
        Double nota2 = sc.nextDouble();
        System.out.print("Por último introduzca la tercera nota: ");
        Double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("La media es %.2f\n", media);
        if (media < 5) {
        System.out.println("Insuficiente");
        }
        if ((media >= 5) && (media < 6)) {
            System.out.println("Suficiente");
        }
        if ((media >= 6) && (media < 7)) {
            System.out.println("Bien");
        }
        if ((media >= 7) && (media < 9)) {
            System.out.println("Notable");
        }
        if (media >= 9) {
            System.out.println("Sobresaliente");
        }
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO11
        System.out.print("A continuación deberá introducir una hora del día, ");
        System.out.println("primero introducirá la hora y luego los minutos.");
        System.out.print("hora: ");
        int horas = sc.nextInt();
        System.out.print("minutos: ");
        int minutos = sc.nextInt();
        int segundosTranscurridos = (hora * 3600) + (minutos * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;            
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", horas, minutos, segundosHastaMedianoche);         
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO12
        int puntos = 0;
        String respuesta;
        System.out.println("CUESTIONARIO DE 1º DAW");
        System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        respuesta = sc.next();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
        System.out.println("a) XML\nb) SELECT\nc) SQL");
        System.out.print("=> ");
        respuesta = sc.next();
        if (respuesta.equals("c")) {
            puntos++;
        }
        System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta.");
        System.out.println("a) href\nb) a\nc) link");
        System.out.print("=> ");
        respuesta = sc.next();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
        System.out.println("a) /etc\nb) /config\nc) /cfg");
        System.out.print("=> ");
        respuesta = sc.next();
        if (respuesta.equals("a")) {
             puntos++;
        }
        System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("a) RAM\nb) EPROM\nc) ROM");
        System.out.print("=> ");
        respuesta = sc.next();
        if (respuesta.equals("a")) {
            puntos++;
        }
        System.out.println("\nHa obtenido " + puntos + " puntos.");
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO13    
        int aux;
        System.out.println("Este programa ordena tres números introducidos por teclado.");
        System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // ordenación de los dos primeros números
        if (a > b) {
        aux = a;
        a = b;
        b = aux;
        }
        // ordenación de los dos últimos números
        if (b > c) {
        aux = b;
        b = c;
        c = aux;
        }
        // se vuelven a ordenar los dos primeros
        if (a > b) {
        aux = a;
        a = b;
        b = aux;
        }
        System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO16 
    System.out.println("Este programa pinta una pirámide.");
    System.out.print("Introduzca un carácter de relleno: ");
    String r = sc.next();
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int opcion = sc.nextInt();
        switch(opcion) 
        {
            case 1:
                System.out.println(" " + r);
                System.out.println(" " + r + r + r);
                System.out.println(r + r + r + r + r); break;
            case 2:
                System.out.println(r + r + r + r + r);
                System.out.println(" " + r + r + r);
                System.out.println(" " + r);break;
            case 3:
                System.out.println(" " + r);
                System.out.println(" " + r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println(" " + r + " " + r);
                System.out.println(" " + r);break;
            case 4:
                System.out.println(r);
                System.out.println(r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println(r + " " + r);
                System.out.println(r);break;
                default:
        }
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO22
            System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
            String di = sc.next();
            int diaNumerico = 0;
            switch(di) {
                case "lunes":
                    diaNumerico = 0; break;
                case "martes":
                    diaNumerico = 1; break;
                case "miércoles":
                case "miercoles":
                    diaNumerico = 2; break;
                case "jueves":
                    diaNumerico = 3; break;
                case "viernes":
                    diaNumerico = 4; break;
                 default:
                    System.out.println("El dia no es correcto");
            }
            System.out.println("A continuación introduzca la hora (hora y minutos)");
            System.out.print("Hora: ");
            int horass = sc.nextInt();
            System.out.print("Minutos: ");
            int minutoss = sc.nextInt();
            int minutosTotales = (4 * 24 * 60) + (15 * 60);
            int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
            System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
    System.out.println("**************************");
    System.out.println("**************************");   
    //NUMERO23
            System.out.print("Introduzca la base imponible: ");
            double baseImponible = sc.nextDouble();
            System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
            String tipoIVA = sc.next();
            System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            String codigoPromocional = sc.next();
    // Calcula el IVA y el precio antes del descuento
            int tipoIVANumerico = 0;
            switch(tipoIVA) {
                case "general":
                    tipoIVANumerico = 21; break;
                case "reducido":
                    tipoIVANumerico = 10; break;
                case "superreducido":
                    tipoIVANumerico = 4; break;
                default:
                    System.out.println("El tipo de IVA introducido no es correcto.");
            }
            double iva = baseImponible * tipoIVANumerico / 100;
            double precioSinDescuento = baseImponible + iva;
    // Calcula el descuento
            double descuento = 0;
            switch(codigoPromocional) {
                case "nopro": break;
                case "mitad": // el precio se reduce a la mitad
                    descuento = precioSinDescuento / 2; break;
                case "meno5": // se descuentan 5 euros
                    descuento = 5; break;
                case "5porc": // se descuenta el 5%
                    descuento = precioSinDescuento * 0.05; break;
                default:
                    System.out.println("El código promocional introducido no es correcto.");
            }
    // Muestra el precio final del producto desglosado
            double total = precioSinDescuento - descuento;
            System.out.printf("Base imponible %6.2f\n", baseImponible);
            System.out.printf("IVA (%2d%%) %6.2f\n", tipoIVANumerico, iva);
            System.out.printf("Precio con IVA %6.2f\n", precioSinDescuento);
            System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, descuento);
            System.out.printf("TOTAL %6.2f", total);
   
    
    }
    
}
