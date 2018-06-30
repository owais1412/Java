import java.io.*;
import java.util.Scanner;
class calci
{
    public static void main()
    {
        double a,b,c;
        System.out.println("enter 2 no.s");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        
        c=a+b;
         System.out.println("The sum is "+c);
    }
}
