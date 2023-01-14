package LeetCode;

import java.util.random.RandomGenerator;

public class HappyNumber202 {
    private static boolean isHappy(int n) {
        int sum = 0;
        int t = n;
        int i = 0 , j=0;
        while(true) {
            sum = 0;
            while (t > 0) {
                int rem = t % 10;
                sum += rem * rem;
                t = t / 10;
            }
            System.out.print(sum + " ");
            j++;
            t = sum;
           // System.out.println();
            if (1 == sum)
                return true;
            if (sum == 4)
                return false;
            return isHappy(sum);
        }
    }
    public static void main(String[] args) {
        for(int i =0 ;i<20;i++)
        {
            int rand = (int)(Math.random()*100 + 1);
            System.out.print(rand + " ");
            System.out.println(isHappy(rand));
            System.out.println();
        }
    /*
        System.out.println(isHappy(1)); //true
        System.out.println(isHappy(2)); //false
        System.out.println(isHappy(3)); //false
        System.out.println(isHappy(4)); //false
        System.out.println(isHappy(5)); //false
       System.out.println(isHappy(6));  //false
       System.out.println(isHappy(7));  //true
       System.out.println(isHappy(8));//false
       System.out.println(isHappy(9));  //false
*/
    }
}
