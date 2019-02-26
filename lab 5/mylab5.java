import java. util.Scanner;
  public class mylab5
{public static void main(String[]args)
  {    Scanner M=new Scanner(System.in);
        int count=1;
        while(count<=20)
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