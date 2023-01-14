package LeetCode;

public class RemoveDuplicatesfromSortedArray26
{
    public static int removeDuplicates(int[] nums)
    {
        int j =0;
        int i =0;
     int length =nums.length;
        while(i<length)
        {
            while(i < length-1 && nums[i] == nums[i+1])
            {
                i++;
            }
            nums[j]=nums[i];
            i++;
           j++;
        }
        return j;
    }
    public static void main(String[] args)
    {
        int[] nums ={1,1,1};
        System.out.println(removeDuplicates(nums));
    }
}
