package String.StringBuffer;
public class CompressionOfString {
    public static void main(String[] args) {
        String s = "XXYXAAABBEEM";          //Output:X2Y1X1A3B2E2M1
        int count = 1;
        char check = s.charAt(0);
        String finalRes = "";

        for(int i = 1 ;i <s.length();i++ ) //1,2,3,4 to 6
        {
            char ch = s.charAt(i);
            if (ch == check) {
                count++;
            }
            else
            {
                finalRes = finalRes.concat(s.charAt(i-1) + "" + count);
                check = ch;
                count = 1;
            }
        }
        finalRes = finalRes.concat(check + "" + count);
        System.out.println(finalRes);
    }
}
