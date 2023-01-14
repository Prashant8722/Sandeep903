package LeetCode;

public class LongestCommonSubstring {
    public static String LongestCommonSubstringQuestion(String[] strs) {
        int count = 0;
        StringBuilder str= new StringBuilder();
        String res = "";
        int maxi= Integer.MAX_VALUE;
        for (String s : strs) maxi = Math.min(s.length(), maxi);
        int counter =0;

        for(int i = 0 ; i<maxi ; i++)
        {
            char ch =strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) == ch) {
                    counter++;
                if(counter==strs.length){
                    str.append(s.charAt(i));
                    count=str.length();
                    counter=0;
                }
                }
                else {
                    counter = 0;
                        if(count>=res.length())
                            res+=str;
                        str= new StringBuilder("");
                    }
                }
            }
        if(count>res.length()) {
              res="";
              res+=str;
        }
        return res;
    }
    public static void main(String[] args) {
//        String[] strs = {"flower","fldddwer","flacdwer"};
        String[] strs = {"flowder","fkowd"};
        String res = LongestCommonSubstringQuestion(strs);
        System.out.println("Returned Result:=>" + res);
//        int len = strs[1].length();
//        String k = "Sandeep";
//        char ls = strs[1].charAt(3);
//        System.out.println("Length of String:"+ ls);

    }
}
