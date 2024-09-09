import java.util.Scanner;
class sumdigit
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int n=sc.nextInt();
        int pal=n;
        
        int rev;
        int rem=0;
        int a=0;
        int b;
        while(n!=0)
        {
            rev=n%10;
            rem=(rem*10)+rev;
            n=n/10;
            a=a+rev;
        }
        b=a;
        int rev2;
        int rem2=0;
        while(a!=0)
        {
            rev2=a%10;
            rem2=(rem2*10)+rev2;
            a=a/10;
        }

        if(b==rem2)
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
    }
}