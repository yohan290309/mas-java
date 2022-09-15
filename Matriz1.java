/*
Dada la siguiente matriz, realizar la operación
indicada en la última posición de las columnas.
A = 79      D = 56          G =120
B = 698     E =487          H =37
C = A +B    F = D(D - E)    I = H{G(√H)
 */
package aprendiendojava;

public class Matriz1 
{
    public static void main (String[] args)
    {
        double matriz [][] = new double [3][3];
        matriz [0][0] = 79;
        matriz [0][1] = 56;
        matriz [0][2] = 120;
        matriz [1][0] = 698;
        matriz [1][1] = 487;
        matriz [1][2] = 37;
        matriz [2][0] = matriz [0][0] + matriz [1][0];
        matriz [2][1] = matriz [0][1] * (matriz [0][1] - matriz [1][1]);
        matriz [2][2] = matriz [1][2] * (matriz [0][2]) * (Math.sqrt(matriz [1][2]));
        for(int i = 0; i <=2; i ++){
        for(int j = 0; j<=2; j ++){
        System.out.print(matriz[i][j] + " ");
        }
        System.out.println("");
        }
        
    }        
}
