import static java.lang.System.out;
import java.util.Scanner;
public class mylab4
{    public static void main(String[]args)
  {Scanner mine=new Scanner(System.in);
  out.println("please give me a num");
  int num1;
  num1=mine.nextInt();
    out.println(num1);
  out.println("please give me a num");
  int num2;
  num2=mine.nextInt();
   
  int subs;
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