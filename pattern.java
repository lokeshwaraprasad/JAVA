import java .util.*;
public class pattern {
    public static void main(String args[])
    {
        int j=1;
        int k=1;
        while(k<=5)
        {
            for(int i=5;i>0;i--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
            k++;
            j=j+1;
        }
    }
}
