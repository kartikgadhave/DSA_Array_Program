
class arrbuypaint 
{
    public static void main(String[] args) 
    {
        int[] arr={2,3,5,1,1,2,1};
        int money=7;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=money)
            {
                money=money-arr[i];
                count++;
            }
            else
            {
                continue;
            }
        }
        System.out.println(count);
    }
}