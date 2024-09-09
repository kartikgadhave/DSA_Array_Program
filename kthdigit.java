import java.util.Scanner;
class kthdigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A :");
        int A=sc.nextInt();
        System.out.println("Enter B :");
        int B=sc.nextInt();
        System.out.println("Enter K :");
        int K=sc.nextInt();
        
        double num=Math.pow(A,B);
        double d=0;
        while(K>0)
        {
            d=num%10;
            num=num/10;
            K--;
        }
        int c=(int)d;
        System.out.println(c);
    }
}