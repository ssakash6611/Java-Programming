import java.util.Scanner;
public class mylab1
{
      public static void main(String[]args)
      {      
           Scanner j=new Scanner(System.in);
           int []a=new int[3];
           int sum=0;
           for(int i=0;i<a.length;i++)
           {
                 System.out.println("give me a number");
                 a[i]=j.nextInt();
                 sum=sum+a[i];
           }
           System.out.println(sum);
           for(int v=0;v<a.length;v++)
           {
                System.out.println(a[v]);
           }
      }
}
           