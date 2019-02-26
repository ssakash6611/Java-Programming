import static java.lang.System.out;
import java.util.Scanner;
public class mylab6
{   public static void main(String[]args)
  {      Scanner M=new Scanner(System.in);
    int count=1;
    int sum=0;
    while(count<=20)
    {int num=M.nextInt();
    sum=sum+num;
    out.println(sum);
    count++;
    }
    double avg=sum/5.0;
    out.println(avg);
}
}
    