package com.company;
import java.util.Scanner;

class MatchPattern
{
    public int MatchPatternFunction(char[] t, char[] p){

        int n=t.length;
        System.out.println("t:" + n);
        int m = p.length;
        System.out.println("p:" + m);

        int j;
        int i;
        for(i = 0; i <= n-m; i++) {
            j=0;
            while(j < m && t[i+j] == p[j]) {
                j++;
                if (j == m) {
                    return i;
                }
            }
        }
        return -1;
    }
}

public class BruteForceMatchPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Text T:");
        String T=sc.next();
        char[] t = T.toCharArray();

        System.out.println("Please Enter Pattern P:");
        String P=sc.next();
        char[] p = P.toCharArray();

        MatchPattern mp = new MatchPattern();
        int res=mp.MatchPatternFunction(t,p);
        System.out.println("Match Pattern index: " + res);
    }

}
