class Solution {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0, left = 0, right = height.length-1;
        int capacity = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (height[left] < height[right]) {
                capacity += leftMax - height[left];
                left++;
            }else{
                capacity += rightMax - height[right];
                right--;
            }
        }
        return capacity;
    }
}