import java.util.Scanner;
public class mylab2
{
      public static void main(String[]args)
      {      
           Scanner j=new Scanner(System.in);
           int []a=new int[10];
           
           for(int i=0;i<a.length;i++)
           {
                 System.out.println("give me a number");
                 a[i]=j.nextInt();
                 
           }
           System.out.println("give me which num");
            int v=j.nextInt();
            System.out.println(a[v]);
      }
}