package LeetCode;

import static java.lang.Integer.*;

/* Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {
        int currentPreviousSum = 0;
        int maxSum = MIN_VALUE ;
        int i = 0 ;
        while(i < nums.length)
        {
            currentPreviousSum = (currentPreviousSum + nums[i]);
           maxSum =  Math.max (currentPreviousSum,maxSum );
            if(currentPreviousSum < 0) {
                currentPreviousSum = 0;
            }
                i++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
    //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int[] nums = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));
    }
}
