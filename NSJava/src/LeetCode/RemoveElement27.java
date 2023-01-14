package LeetCode;

public class RemoveElement27 {
/*  Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
  Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 */
    public static int removeElement(int[] nums, int val) {
        int i =0; int j= 0;
        while(i<nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
    int[] nums = {1,2,3,3,4,5,3};
    int val =3;
    System.out.println(removeElement(nums,val));
    }
}
