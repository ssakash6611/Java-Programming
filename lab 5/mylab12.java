import static java.lang.System.out;
import java.util.Scanner;
public class mylab12
{    public static void main(String[]args)
    {      Scanner M=new Scanner(System.in);
           int c=1;
           while(c<=600)
           {
               out.println("give num");
               int num=M.nextInt();
               if(num%7==0)
               {if(num%9!=0)
                   {out.println(num);
                   }
               }
               else{if(num%9==0)
                   {out.println(num);}
               }
               c++;
           }
}
}