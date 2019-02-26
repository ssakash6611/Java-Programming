import java.util.Scanner;
public class l7t8
{    public static void main(String[]args)
    {    Scanner J=new Scanner (System.in);
         int a[]=new int[5];
         int learge=0;
         int small=0;
         for(int i=0;i<a.length;i++)
        {  System.out.println("give me a number");
            a[i]=J.nextInt();
        }

         int loc1=0;
         for(int c=0;c<a.length;c++)
         {   if(a[c]>learge)
             {   
                  learge=a[c];
                  loc1=c;
         }
       
         }
           System.out.println("the leargest number is "+learge+"and it's location is "+loc1);
}}