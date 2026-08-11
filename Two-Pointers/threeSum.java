import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
     public List<List<Integer>> threeSumFunction(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        //  int n= nums.length-1;

        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        // i is fix ;
        for (int i = 0; i < nums.length - 2; i++) {
            // rest two element ,we use two pointer approach,
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum < 0) {
                    j++;
                } else 
                    k--;
            }
        }
        return new ArrayList<>(ans);
    }
}
