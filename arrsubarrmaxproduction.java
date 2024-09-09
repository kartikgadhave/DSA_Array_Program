import java.util.*;
class arrsubarrmaxproduction 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,-3,0,-4,-5};
        int prod = 1;
        int max = 1;
        
        for (int i = 0; i < arr.length; i++) 
        {
            prod = 1; 
            for (int j = i; j < arr.length; j++) 
            {
                prod = prod * arr[j];
                if (prod > max) 
                {
                    max = prod; 
                }
            }
        }
        System.out.println(max); 
    }
}
