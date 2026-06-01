import java.util.Arrays;

class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int highest = 0;
        for (int num : height){
            if (highest < num){
                highest = num;
            }
        }
        System.out.printf("Highest = %s %n", highest); /* for debugging */

        while (highest > 0) {
            ans += countLine(height);
            System.out.println(countLine(height)); /* for debugging */
            minusHeight(height);
            System.out.println(Arrays.toString(height)); /* for debugging */
            highest--;
            System.out.println(highest); /* for debugging */
        }
        return ans;
    }

    public int countLine(int[] height){
        int i = 0;
        int j = height.length-1;
        while (i < j) {
            if (height[i] <= 0) {
                i++;
            }else if (height[j] <= 0){
                j--;
            }else{
                break;
            }
        }
        if (i == j || i == j-1){return 0;}

        int length = j - i - 1;
        int occupied = 0;
        for (int notZero = i+1; notZero < j; notZero++){
            if (height[notZero] > 0) {
                occupied++;
            }
        }
        return length-occupied;
    }

    public void minusHeight(int[] height){
        for (int i = 0; i < height.length; i++) {
            height[i]--;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {4,2,0,3,2,5};
        System.out.printf("Answer: %s", s.trap(height));
    }
}
