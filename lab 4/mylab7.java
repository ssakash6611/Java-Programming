import static java.lang.System.out;
import java.util.Scanner;
public class mylab7
{    public static void main(String[]args)
  {Scanner mine=new Scanner(System.in);
  out.println("please give me a num");
  int num1;
  num1=mine.nextInt();
    out.println(num1);

  
if (num1%2==0)
{ if(num1>10)
{out.println("An even number is greater than 10");
}
else
{out.println("An even number is not greater than 10");
}
}


else
{ if (num1>10)
{out.println("An odd number is greater that 10 ");
}
 else
 {out.println("An odd number is not greater than 10");
 }
} 
}
}