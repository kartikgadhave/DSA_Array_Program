
import java.util.*;
class arrsortevenoddsecondlargestadd 
{
    public static void main(String[] args) 
    {
        int[] arr={3,2,1,7,5,4};
        
        if(arr==null || arr.length<=3)
        {
            System.out.println("0");
        }
        
        int[] arr2=new int[arr.length/2];
        int index=0;
        for(int i=0;i<arr.length;i+=2)
        {
            arr2[index]=arr[i];
            index++;
            
        }
        System.out.println(""+Arrays.toString(arr2));
        
        int[] arr3=new int[arr.length/2];
        int index2=0;
        for(int j=1;j<arr.length;j+=2)
        {
            arr3[index2]=arr[j];
            index2++;
        }
        System.out.println(""+Arrays.toString(arr3));
        
        int max;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr2[i]>arr2[j])
                {
                    max=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=max;
                }
            }
        }
        System.out.println(""+Arrays.toString(arr2));
        
         int max2;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=i+1;j<arr3.length;j++)
            {
                if(arr3[i]>arr3[j])
                {
                    max=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=max;
                }
            }
        }
        System.out.println(""+Arrays.toString(arr3));
        
        int sum=arr2[arr2.length-2]+arr3[arr3.length-2];
        System.out.println(sum);
    }
}