public class tri {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<i;k++)
            System.out.print(" ");
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int h= n; h >= 1; h--) {
             
              for (int k = 1; k < h; k++) {
                  System.out.print(" ");
              }
              
              for (int l = h; l<= n; l++) {
                  System.out.print(l+ " ");
              }
              
              System.out.println();
          }
      }
    
}
