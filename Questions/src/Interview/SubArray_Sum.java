package Interview;

import java.util.ArrayList;

public class SubArray_Sum {
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        
      int start = 0;
        int currentSum = 0;

        ArrayList<Integer> result = new ArrayList<>();

        if (s == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    result.add(i + 1);
                    result.add(i + 1);
                    return result;
                }
            }
            result.add(-1);
            return result;
        }

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > s && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == s) {
                result.add(start + 1); 
                result.add(end + 1);  
                return result;
            }
        }

       result.add(-1);
        return result;
        
        
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int n =4;
		int s = 0;
		System.out.println(subarraySum(arr,n,s));
	}
	
}
