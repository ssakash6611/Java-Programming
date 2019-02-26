import java.util.Scanner;
public class L7t3
{
    public static void main(String [] args)
    {
        Scanner J=new Scanner(System.in);
        int a[]= new int[10];
        for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=J.nextInt();
        }
        for(int c=0;c<a.length;c++)
        {   
          if(a[c]%2!=0)
          {  System.out.println(a[c]);
            break;
          }
        }
    }
}
          
              