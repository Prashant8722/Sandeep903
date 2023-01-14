package LeetCode;

public class MaximumProductSubarray152 {
    /* Input: nums = [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.
     */
        public static int maxProduct(int[] nums) {
//        int globalProduct = 1;
//        int maxProduct = Integer.MIN_VALUE;
            int result = nums[0];
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int mul = nums[i];
                for (int j = i + 1; j < n; j++) {
                    result = Math.max(result, mul);
                    mul *= nums[j];
                }
                result = Math.max(result, mul);
            }
            return result;
        }
    public static int maxProductOptimized(int[] nums) {
        int currentProduct = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int num : nums) {
            currentProduct *= num;
            ans = Math.max(currentProduct, ans);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        currentProduct =1;
        for(int i = n-1; i >= 0; i--) {
            currentProduct*=nums[i];
            ans=Math.max(currentProduct, ans);
            if(currentProduct==0)
            {
                currentProduct = 1;
            }
        }
        return ans;
    }
        public static void main(String[] args) {
            int[] nums = {2, 3, -2, -4};
            System.out.println("Brute Force:"+ maxProduct(nums));
            System.out.println("Optimized:" + maxProductOptimized(nums));
        }
    }
