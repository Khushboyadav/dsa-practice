package Patterns;

public class AlphaTrianglePattern1 {
    public static void main(String[] args)
    {
        int row=5;
        for(int i=1; i<=row; i++)
        {
            char alp='A';
            for(int j=1; j<=i; j++)
            {
                System.out.print(alp+" ");
                alp=(char)(alp+j);
            }
            System.out.println();
        }
    }
    
}
