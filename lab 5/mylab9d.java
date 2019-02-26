public class mylab9d
{
    public static void main(String [] args)
    {
        
        int c=1;
        while(c<=10)
        {
            if(c%2==0)
            {
                if(c%4==0)
                {
                    System.out.print(","+"-"+c+",");
                    c++;
                }
                else
                {
                    System.out.print(c);
                }
            }
            else{}
            c++;
        }
    }
}