import java.util.Scanner;
public class l7t10
{    public static void main(String[]args)
    {    Scanner J=new Scanner (System.in);
    int a[]=new int[5];
    int temp;
        
          for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=J.nextInt();
        }
          
        for(int b=0;b<5;b++)
        {
            for(int c=0;c<4;c++)
            {  
                if(a[c]>a[c+1])
                { 
                  temp=a[c];
                  a[c]=a[c+1];
                  a[c+1]=temp;
                }
                
            }
        }
        for(int v=0;v<5;v++)
                {   System.out.println(a[v]);
                }
}
}