
package aprendiendojava;

public class Operaciones 
{        
     public static void main(String[] args)   
{
    double resultado1 = 6.0 * (-Math.pow(3.0, 3.0))-4;
    double resultado2 = -4 -(Math.pow(-3,2))+ Math.sqrt(9);
    double resultado3 = (Math.pow((4 * 2),4));
    double resultado3a = (10+12);
    double resultado3b = (4 + 6 -8);
    double resultadototal = resultado3a - resultado3b -resultado3;
    System.out.println(resultado1);
    System.out.println(resultado2);
    System.out.println(resultado3);
    System.out.println(resultadototal);
    
    double numero = 45.789;
    //Redondeo de 45.789
    double redondeo = Math.round(numero);
    System.out.println(redondeo);
    // Truncamiento de 45.789
    int truncado = (int)numero;
    System.out.println(numero);
}
}



