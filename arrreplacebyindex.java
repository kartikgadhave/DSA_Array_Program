import java.util.*;
class arrreplacebyindex
{
    public static void main(String[] args) 
    {
        int[] arr={20,15,26,2,98,6};
        int[] arr2={20,15,26,2,98,6};
        int max;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
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
        System.out.println(""+Arrays.toString(arr2));
        
        int[] arr3=new int[arr.length];
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr2.length;j++)
           {
                if(arr[i]==arr2[j])
                {
                    arr3[i]=j;
                }
           }
       }
       System.out.println(""+Arrays.toString(arr3));
    }
}