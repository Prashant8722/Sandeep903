package LeetCode;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {
    public static void main(String[] args) {
        int[] numbs = new int[]{10, 12, 16, 23, 3};
        int largestPerimeter = 0;
        Arrays.sort(numbs);
        for (int k : numbs)
            System.out.print(k + " ");
        System.out.println();
        for (int i = numbs.length - 1; i >= 2; i--) {
            int a = numbs[i];
            int b = numbs[i - 1];
            int c = numbs[i - 2];

            if (a + b > c && b + c > a && a + c > b) {
                largestPerimeter = (a + b + c);
                System.out.println("largestPerimeter:" + largestPerimeter);
                break;
            }
        }
    }
}
