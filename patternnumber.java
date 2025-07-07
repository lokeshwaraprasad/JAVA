public class patternnumber {
    public static void main(String args[])
    {
        int n=5; //row
        int m=5; //col;

        int k=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(j<=i)
                {
                    System.out.print(k+" ");
                    k+=1;
                }
            }
            System.out.println();
        }
    }
    
}
