import java.util.Scanner;
public class mylab5
{
    public static void main(String [] args)
    {
        Scanner j=new Scanner(System.in);
        int a[]= new int[10];
        for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=j.nextInt();
        }
        for(int c=a.length-1;c>=0;c--)
        {   
          if(a[c]%2!=0)
          {  System.out.println(a[c]);
            break;
          }
        }
    }
}