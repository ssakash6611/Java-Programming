import static java.lang.System.out;
import java.util.Scanner;
public class mylab5
{    public static void main(String[]args)
  {Scanner mine=new Scanner(System.in);
  out.println("please give me a num");
  double num1;
  num1=mine.nextDouble();
    out.println(num1);
  out.println("please give me a num");
  double num2;
  num2=mine.nextDouble();
   
  double subs;
if (num1>num2){
  subs=num1-num2;
out.println(subs);
}
else
  {
 
     subs=num2-num1;
     out.println(subs);
     
  }
}
}