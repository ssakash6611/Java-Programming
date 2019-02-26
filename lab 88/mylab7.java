public class mylab7
{
      public static void main(String[]args)
      {
        int[]a={7,13,2,10,6};
            int large=a[0];
            for(int i=1;i<a.length;i++)
            {
                 if(a[i]>large)
                 {
                     large=a[i];
                 }
                
            }
             System.out.println(large);
      }
}