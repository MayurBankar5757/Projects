package Interview;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicate solution = new RemoveDuplicate();
        int[] nums = {1, 1, 2};
        int newLength = solution.removeDuplicates(nums);
         System.out.println("New length: " + newLength);
        // System.out.println("Array with unique elements: " + Arrays.toString(Arrays.copyOfRange(nums, 0, newLength)));
    }
}
