class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 0) {
                count++;
            } else {
                nums[index-count] = nums[index];
            }
        }
        for (int index = nums.length - count; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}
