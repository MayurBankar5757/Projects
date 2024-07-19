package Interview;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3; // Value to be removed
        int  newSize    = removeElement(nums, val);
        int[] result = Arrays.copyOf(nums, newSize);
        System.out.println(Arrays.toString(result));
        
    }

    public static int removeElement(int[] nums, int val) {
        int newIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newIndex++] = nums[i];
            }
        }

        return newIndex;
    }
}
