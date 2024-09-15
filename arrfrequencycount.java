
public class arrfrequencycount 
{
    public static void main(String args[])
    {
        int[] arr={1,2,2,2,6};
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
        int second=(arr.length-2);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==second)
            {
                count++;
            }
        }
        System.out.println(count);
    }    
}
