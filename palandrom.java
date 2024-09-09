import java.util.Scanner;
class palandrom
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
        while(n!=0)
        {
            rev=n%10;
            rem=(rem*10)+rev;
            n=n/10;
            
        }
       
        //System.out.println("its a reverse number :- "+rem);
        if(pal==rem)
        {
            System.out.println("its a plindrom number ..");
        }
        else
        {
            System.out.println("is is not a plindrom number ..");
        }
    }
}