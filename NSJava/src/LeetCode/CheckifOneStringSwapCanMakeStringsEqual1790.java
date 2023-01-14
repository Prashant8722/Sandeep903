package LeetCode;

import java.util.Arrays;

public class CheckifOneStringSwapCanMakeStringsEqual1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        /*
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();
        Arrays.sort(charS1);
        Arrays.sort(charS2);
        return (Arrays.equals(charS2, charS1));
*/
        if (s1.compareTo(s2) == 0) return true;
        int first = -1, second = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) first = i;
                else if (second == -1) second = i;
                else return false;
            }
        }
        if (first == -1 || second == -1) return false;
        return s1.charAt(first) == s2.charAt(second) &&
                s1.charAt(second) == s2.charAt(first);
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("abcd","badc"));
        System.out.println(areAlmostEqual("adb","bad"));
    }
}
