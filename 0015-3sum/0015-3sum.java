import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int m = i + 1, r = nums.length - 1;
            while (m < r) {
                int val = nums[i] + nums[m] + nums[r];
                if (val == 0) {
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[m]);
                    li.add(nums[r]);
                    output.add(li);    
                while (m < r && nums[m] == nums[m + 1]) {
                    m++;
                }
                m++;
                r--;
                } else if (val < 0) {
                    m++;
                } else {
                    r--;
                }
            }
        }
        return output;
    }
}