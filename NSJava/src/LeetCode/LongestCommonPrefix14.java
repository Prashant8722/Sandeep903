package LeetCode;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        String str = "";
        int min = Integer.MAX_VALUE;
        for (String s : strs) min = Math.min(s.length(), min);
        int counter = 0;
        for (int i = 0; i < min; i++) {
            char ch = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != ch)
                {
                    return str;
                }
                else {
                    counter++;
                    if (counter == strs.length)
                    {
                        str += s.charAt(i);
                        counter=0;
                    }
                }
            }
        }
    return str;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"flowder","fkowd"};
        String res = longestCommonPrefix(strs);
        System.out.println("Returned Result:=>" + res);
    }
}
