package LeetCode;
/*
Input: num1 = [1,2,3,0,0,0], m = 3, num2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray88 {
    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m-1, j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0)
        {
            if(num1[i] > num2[j])
            {
                num1[k--] = num1[i--];
            }
            else
            {
                num1[k--] = num2[j--];
            }
        }
        while(j>=0)
        {
            num1[k--] = num2[j--];
        }

    }
    public static void main(String[] args) {
        int[] num1 = {1,2,4,5,6,0};
        int[] num2 = {3};
        int n = num2.length;
        int m = num1.length- n;
        merge(num1 , m , num2 , n);
        for (int p : num1
             ) {
            System.out.print(p + " ");
        }
    }
}
