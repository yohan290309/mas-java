
package aprendiendojava;

public class Vector1
{

    public static void main (String[] args)
    {
        double Vector [] = new double [4];
        Vector [0] = 24.89;
        Vector [1] = 38.67;
        Vector [2] = 45.21;
        Vector [3] = Vector[0] * (Math.sqrt(Vector[1])* (Vector[0] + Math.pow(Vector [2],3 )));
        System.out.println(Vector[3]);
    }
    
}