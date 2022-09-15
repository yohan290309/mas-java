
package aprendiendojava;


public class Matrizz 
{
    public static void main (String [] args )
    {
        int matriz [][] = new int[3][3];
        matriz [0][0] = 1;
        matriz [0][1] = 2;
        matriz [0][2] = 3;
        matriz [1][0] = 4;
        matriz [1][1] = 5;
        matriz [1][2] = 6;
        matriz [2][0] = 7;
        matriz [2][1] = 8;
        matriz [2][2] = 9;
        for(int i=0; i<=2; i=i+1)
        {
            for(int j=0; j<=2; j=j+1)
            {
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("*********************");
        int matrizz[][] = new int[3][3];
        int apoyo = 1;
        for(int x = 0; x <= 2; x ++)
        {
            for(int y = 0; y <= 2; y ++)
            {
                matrizz[x][y] = apoyo;
                apoyo = apoyo + 1;
                System.out.print(matrizz[x][y]);
            }
        }
        
    }  
}
