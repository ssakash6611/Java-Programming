import java.util.Scanner;
public class L7t2
{
    public static void main(String [] args)
    {
        Scanner J=new Scanner(System.in);
        int a[]= new int[10];
        for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=J.nextInt();
        }
        System.out.println("give me ur number");
        int n=J.nextInt();
        System.out.println(a[n]);
    }
}
        