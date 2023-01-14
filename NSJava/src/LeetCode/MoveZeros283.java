package LeetCode;
//        Input: nums = [1,0,0,3,12]
//        Output: [1,3,12,0,0]
public class MoveZeros283
{
//    public void swap(int x, int y) {
//        int temp = x;
//        x = y;
//        y = temp;
//    }
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        int length = nums.length;
        if(length==0 || length==1){
            return;
        }
        while(j < length)
        {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            j++;
        }
        for(int num:nums) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
        int[] nums = {1,0};
        moveZeroes(nums);
    }
}
