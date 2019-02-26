import static java.lang.System.out;
import java.util.Scanner;
public class mylab10
{public static void main(String[]args)
      {    Scanner M=new Scanner(System.in);
           int num;
           out.println("please give me a num");
           num=M.nextInt();
           if (num>=90)
           {out.println("A");
           }
           else if
           (num>=80)
           {out.println("B");
           }
           else if
             (num>=70)
           {out.println("C");
           }
           else if
            ( num>=60)
           {out.println("D");
           }
           else if
             (num>=50)
           {out.println("E");
           }
           else if
             (num<50)
           {out.println("F");
           }
           out.println("thank you");  
         
}
           }