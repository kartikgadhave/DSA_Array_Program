import java.util.Arrays;
class arrprintoddele 
{
    public static void main(String args[]) 
    {
        
        int[] arr = {1, 2, 3, 4, 5};
        int tot = arr.length;
        
        int resultSize = (tot + 1) / 2;
        int[] result = new int[resultSize];
        int index = 0;

        for (int i = 0; i < tot; i += 2) 
        {
            result[index] = arr[i];
            index++;
        }

        System.out.println("Output: " + Arrays.toString(result));
    }
}
