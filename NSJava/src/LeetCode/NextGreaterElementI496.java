package LeetCode;
/*
Test Case 2:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
        Output: [-1,3,-1]

 Test Case 2:
Input: nums1 = [4,3,2,1], nums2 = [1,2,3,4]
        Output: [,3,-1]

 Test Case 3:
 nums1:[21,1,0]
 nums2:[1,0,14,21]
 output:[-1,14,14]
 */
public class NextGreaterElementI496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] res = new int[size1];

        for(int i = 0; i < size1 ; i++) {
            int curr = nums1[i];
            for (int j = 0; j < size2; j++) {
                if(curr == nums2[j])
                {
                    for(int k=j+1;k<size2;k++)
                    {
                        if(nums2[k] > curr )
                        {
                            res[i] = nums2[k];
                            break;
                        }
                        else {
                            res[i] = -1;
                        }
                    }
                    if(j+1 >= size2) {
                        res[i] = -1;
                        break;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {21,1,0};
        int[] nums2 = {1,0,14,21};
        int[] resultant = nextGreaterElement(nums1,nums2);
        for (int res:resultant) {
            System.out.print(res+ " ");
        }
    }
}
