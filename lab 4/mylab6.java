import static java.lang.System.out;
import java.util.Scanner;
public class mylab6
{    public static void main(String[]args)
  {Scanner mine=new Scanner(System.in);
  out.println("please give me a num");
  int num1;
  num1=mine.nextInt();
    out.println(num1);

  
if (num1%2==0)
{out.println("the number is even");
}
else
{out.println("the number is odd");
}

}
}