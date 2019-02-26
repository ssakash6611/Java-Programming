import java.util.Scanner;
public class l6t10
{   public static void main(String[]args)
  { Scanner J=new Scanner (System.in);
    System.out.println("give me a number");
    int userinput=J.nextInt();
    int starlimit=1;
    int spacelimit=userinput-1;
    for(int a=1;a<=userinput;a++)
    {   //space loop
        for(int b=1;b<=spacelimit;b++)
        {   System.out.print(" ");
        }
        //starloop
        for(int c=1;c<=starlimit;c++)
        {   System.out.print("*");
        }
        starlimit+=2;
        spacelimit--;
        {System.out.println();
        }
    }
}
}
        
        
        
        