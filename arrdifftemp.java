
class arrdifftemp
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 6, 0, -1, -2, 3, 4, 8};
        int count = 0;
        int maxcount = 0;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < arr[i - 1]) 
            {
                count++;
            } 
            else
            {
                maxcount = Math.max(count, maxcount);
                count = 0;
            }
        }
        maxcount = Math.max(count, maxcount);
        System.out.println(maxcount);  
    }
}
