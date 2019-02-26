import static java.lang.System.out;
import java.util.Scanner;
public class mylab3
{    public static void main(String[]args)
  {Scanner mine=new Scanner(System.in);
  out.println("please give me a num");
  int num1;
  num1=mine.nextInt();
    out.println(num1);
  out.println("please give me a num");
  int num2;
  num2=mine.nextInt();
    out.println(num2);
  
if (num1==num2)
{out.println("the numbers are equal");
}
else
{   if(num1>num2)
  {out.println("first is greater");
    }
else
{out.println("second is greater");
}
}




}
}