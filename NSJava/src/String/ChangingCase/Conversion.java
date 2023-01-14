package String.ChangingCase;

import java.util.Scanner;

public class Conversion {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String S1 = sc.next();
        for(int i = 0 ;i<S1.length();i=i+2)
            System.out.print(S1.charAt(i) + " ");
    }
}
