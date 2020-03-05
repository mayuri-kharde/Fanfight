import java.util.ArrayList;
import java.util.Collections;

public class MinimumCost
{
    public static int findMinimumCost(int arr[], int n, int k)
    {
        ArrayList<Integer> consecutiveDiff = new ArrayList<>();

        for(int i = 1; i < n; i++)
        {
            consecutiveDiff.add((arr[i - 1] * arr[i - 1]) - (arr[i] * arr[i]));
        }

        Collections.sort(consecutiveDiff);
        int sum = (arr[n - 1] * arr[n - 1]) - (arr[0] * arr[0]);

        for(int i = 0; i < k - 1; i++)
        {
            sum += consecutiveDiff.get(i);
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int arr[] = {2,4,5,5,8,11,19};

        System.out.println(findMinimumCost(arr, 7, 3));

    }
}
