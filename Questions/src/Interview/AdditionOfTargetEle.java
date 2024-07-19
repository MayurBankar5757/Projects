package Interview;

import java.util.HashMap;
import java.util.Map;

public class AdditionOfTargetEle {
	public static int[] twoSum(int[]nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			Integer index = map.get(nums[i]);
			
			if(index!=null) {
				return new int[] {i,index};
				
			}
			map.put(target-nums[i], i);
			
		}
		return nums;
	}
	public static void main(String []args) {
		
		int nums [] = {5,7,2,15};
		int target =9;
		int []result= twoSum(nums,target);
		System.out.println(result[0]+" ,"+ result[1]);
		
	}
}
/* Explanation
 * 
 *  
 *  
 *  
 *  *Consider the example where nums = {5, 7, 2, 15} and target = 9:

First Iteration (i = 0):

nums[0] = 5
map is empty.
map.put(target - nums[0], 0) results in map.put(4, 0).
map now contains {4: 0}.
Second Iteration (i = 1):

nums[1] = 7
map contains {4: 0}.
map.put(target - nums[1], 1) results in map.put(2, 1).
map now contains {4: 0, 2: 1}.
Third Iteration (i = 2):

nums[2] = 2
map contains {4: 0, 2: 1}.
map.get(nums[2]) checks if 2 is a key in the map.
index = map.get(2) returns 1 because 2 was previously stored as a key with value 1.
if (index != null) evaluates to true.
return new int[]{i, index} returns [2, 1]


// the Code which returns values instead of indices
 * package Interview;

import java.util.HashMap;
import java.util.Map;

public class AdditionOfTargetEle {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);

            if (index != null) {
                return new int[]{nums[i], nums[index]}; // Return the values instead of indices
            }
            map.put(target - nums[i], i);
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int nums[] = {5, 7, 2, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println(result[0] + " , " + result[1]);
        }
    }
}

*/

