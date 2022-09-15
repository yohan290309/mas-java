
package aprendiendojava;

public class Matriz 
{
    public static void main(String[] args)
    {
        // Matriz de números enteros
        // 3 filas por 4 columnas
        int MatrizEntero [][] = new int[3][4];
        // Matriz de números decimales
        // 4 filas por 5 columnas
        double[][] matrizDecimales = new double[4][5];
        // Vector de cadenas
        // 5 filas por 6 columnas
        String[][] matrizCadenas = new String[5][6];
        //Formas de asignar valores
        int[][] matrizEnteros = {{96,138,57},{86,78,261},{531,186,247}};
        System.out.println(matrizEnteros.length);
        
        //Segunda forma de asisgnar valores
        //Matriz de la figura 3.5
        int[][] matrizEnteross = new int[3][3];
        matrizEnteros[0][0] = 96;
        matrizEnteros[0][1] = 138;
        matrizEnteros[0][2] = 57;
        matrizEnteros[1][0] = 86;
        matrizEnteros[1][1] = 78;
        matrizEnteros[1][2] = 261;
        matrizEnteros[2][0] = 531;
        matrizEnteros[2][1] = 186;
        matrizEnteros[2][2] = 247;
       
    }
}
