import java. util.Scanner;
  public class mylab1
{public static void main(String[]args)
  {    Scanner M=new Scanner(System.in);
        int count=1;
        while(count<=5)
        {System.out.println("give num");
         int num=M.nextInt();
         if(num%2==0)
           System.out.println("even");
         else
         {System.out.println("odd");}
         count++;
        }
}
}