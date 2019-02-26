import java.util.Scanner;
public class l6t11
{   public static void main(String[]args)
  { Scanner J=new Scanner (System.in);
    System.out.println("give me a number");
    int userinput=J.nextInt();
    int starlimit=1;
    int spacelimit=userinput-1;
    int i=userinput;
    for(int a=1;a<=userinput;a++)
    {   //space loop
        for(int b=1;b<=spacelimit;b++)
        {   System.out.print(" ");
        }
        //starloop
        for(int c=i;c<=userinput;c++)
        {   System.out.print(c);
        }
        i=i-1;
        spacelimit--;
        {System.out.println();
        }
    }
}
}
        
        