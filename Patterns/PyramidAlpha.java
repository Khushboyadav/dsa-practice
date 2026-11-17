package Patterns;

public class PyramidAlpha {

    public static void main(String[] args)
    {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            char alp='A';
            for(int j=1;j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++)
            {
                alp=(char)('A'+j);
                System.out.print(alp);
            }
            for(int j=i-2; j>=0; j--)
            {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    
}
