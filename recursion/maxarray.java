import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return 1;
        }
        int max = maxOfArray(arr , idx+1);
        if(max < arr[idx])
        {
            max=arr[idx];
            return max;
        }
        return max;
    }

}
