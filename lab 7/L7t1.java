import java.util.Scanner;
public class L7t1
{
    public static void main(String [] args)
    {
        Scanner J=new Scanner(System.in);
        int a[]= new int[3];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=J.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
        for(int k=0;k<a.length;k++)
        {  System.out.println(a[k]);
        }
    }
}
        