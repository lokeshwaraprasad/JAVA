// hollow rectangle
/*
 * ****************
 *                *
 *                *
 *                *
 * **************** */

 import java.util.*;
public class pattern1 {

    public static void main( String args[])
    {
        int n=4;//row
        int m=5;//col

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1|| i==n||j==1 ||j==m){
                    System.out.print("* ");

                }
                
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    
}
}
