package String.Miscellaneous;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String to reverse:");
        String strInitial = sc.next();
        int len = strInitial.length();
        char[] S = strInitial.toCharArray();
        for(int  i = 0 ; i< len/2 ; i++)
        {
            char temp = S[i];
            S[i]= S[len-1-i];
            S[len-1-i] = temp;
        }
        String finalVar = new String(S);
        System.out.println("Reversal of Given String " + strInitial + " is " + finalVar);
    }
}
