package com.company;
import java.util.Scanner;

public class GoatProblem {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x2= sc.nextInt();
            int y2= sc.nextInt();

            double p = Math.min(Math.abs(x-x1),Math.abs(x-x2));
            double q = Math.min(Math.abs(y-y1),Math.abs(y-y2));

            if( x1 <=x && x <= x2)
            {
                String s = String.format("%.3f", q);
                System.out.print(s);
            }
            else
            if( y1 <=y && y <= y2)
            {
                String s = String.format("%.3f", p);
                System.out.print(s);
            }
            else{
                double a = Math.sqrt(Math.pow((x - x1),2) + Math.pow((y - y1),2));
                double b = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y2) ,2 ));
                double c = Math.sqrt(Math.pow((x-x1),2) + Math.pow((y-y2),2));
                double d = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y1),2));
                double k1 = Math.min(a,b);
                //System.out.println(k1);
                double k2 = Math.min(c,d);
               // System.out.println(k2);
                double k = Math.min(k1,k2);
                String s = String.format(" value: %.3f" , k);
                System.out.print(s);
        }

    }
}
