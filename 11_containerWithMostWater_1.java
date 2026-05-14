class Solution {
    public int maxArea(int[] height) {
        int maxArea = Math.min(height[0], height[height.length - 1]) * (height.length - 1);
        int left = 0;
        int right = height.length - 1;
        int current = 0;
        while (left < right) {
            if (height[left] <= current) {
                left++;
                continue;
            }else if (height[right] <= current) {
                right--;
                continue;
            }
            current = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, current * (right - left));
        }
        return maxArea;
    }
}