import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
       for (int i = n; i >= 1; i--) 
       {
            for (int j = n; j >= 1; j--) {
                for (int k = 1; k <= i; k++) 
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}