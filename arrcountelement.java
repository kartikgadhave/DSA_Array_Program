
import java.util.*;
class arrcountelement
{
    public static void main(String[] args) 
    {
        int[] arr={10,10,90,100,50,47,90,100,47,68};
        int size=arr.length;
        int max;
        int count=1;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                }
            }
        }
        System.out.println(""+Arrays.toString(arr));
        
        
        for (int i = 0; i < size; i++) 
        {

            while (i < size - 1 && arr[i] == arr[i + 1]) 
            {
                count++;
                i++;
            }
            System.out.println(arr[i] + " - " + count);
        }
    }
}