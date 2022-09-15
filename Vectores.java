
package aprendiendojava;


public class Vectores 
{
    public static void main (String [] args)
    {
    // Vector de números enteros con 10 elementos
    int[] VectorEntero = new int[10];
    double VectorDoble [] = new double[20];
    String VectorString [] = new String[30];
    System.out.println(VectorEntero);
    System.out.println(VectorDoble);
    
    //Asignacion al vector forma1
    int[] vector = {105, 48, 29, 79,80};
    //Asignacion al vector forma2
    int[] vectorr= new int[4];
    // Asignación de valores
    vectorr[0] = 105;
    vectorr[1] = 48;
    vectorr[2] = 29;
    vectorr[3] = 79;
    System.out.println(vector.length);//.lengt muestra el tamaño del vector
    System.out.println(vectorr[2]);
    
    // Vector de enteros
    int[] enteros = new int[3];
    enteros[0] = 74;
    enteros[1] = 35;
    enteros[2] = enteros[0] + enteros[1];
    System.out.println(enteros[2]);
    // Vector de decimales
    double[] decimales = new double[3];
    decimales[0] = 25.78;
    decimales[1] = 34.90;
    decimales[2] = Math.pow(decimales[0],2)*(Math.sqrt(decimales[1]) + decimales[0]);
    //Math.sqrt regresa la raiz cuadrada 
    System.out.println(decimales[2]);
    // Vector de cadenas
    String[] palabras = new String[3];
    palabras[0] = "Hola";
    palabras[1] = "Mundo";
    palabras[2] = palabras[0].concat(palabras[1]);
    System.out.println(palabras[2]);
    
    }
}
