public class mylab11
{
      public static void main(String[]args)
      {
        int[]a={7,13,2,10,6};
        int temp=0;
         for(int i=0;i<a.length;i++)
         {
               for( int j=0;j<a.length-1;j++)
               {
                    if(a[j+1]>a[j])
                    {
                      temp=a[j+1];
                      a[j+1]=a[j];
                      a[j]=temp;
                    }
               }
         }
         for(int k=0;k<a.length;k++)
         {
           System.out.println(a[k]);
         }
      }
}