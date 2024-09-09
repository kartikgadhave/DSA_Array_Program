
import java.util.Scanner;
class armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int b;
        int c=n;
        int a=0;
        int rev;
        int rem=0;
        while(n!=0)
        {
            rev=n%10;
            a=0+rev;
            b=(a*a*a);
            n=n/10;
            rem=b+rem;
        }
        if(c==rem)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}