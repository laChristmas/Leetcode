import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int cur = 0; cur < nums.length-2; cur++) {
            if (cur !=0 && nums[cur] == nums[cur-1]) {
                continue;
            }else if (nums[cur]+nums[cur+1]+nums[cur+2]>0) {
                break;
            }else if (nums[cur]+nums[nums.length-1]+nums[nums.length-2]<0) {
                continue;
            }
            int i = cur + 1;
            int j = nums.length - 1;
            while (i < j) {
                if (i != cur+1 && nums[i] == nums[i-1]) {
                    i++;
                    continue;
                }
                if (nums[cur] + nums[i] < (-nums[j])) {
                    i++;
                }else if (nums[cur] + nums[i] > (-nums[j])) {
                    j--;
                }else{
                    ans.add(Arrays.asList(nums[cur], nums[i], nums[j]));
                    i++;
                    j--;
                }               
            }
        }
        return ans;
    }
}