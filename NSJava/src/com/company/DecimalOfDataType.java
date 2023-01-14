package com.company;

import java.text.DecimalFormat;

public class DecimalOfDataType {

    static void printDataTypes(int a, long b, float c, double d, char e)
    {
        double d1 = 2.34568;
        DecimalFormat f = new DecimalFormat("##.00");
        DecimalFormat fd = new DecimalFormat("##.0000");
        System.out.println(fd.format(d1));
        System.out.println(a);
        System.out.println(b);

        System.out.println(f.format(c));

        System.out.println(fd.format(d));

        System.out.println(e);

    }
    static void printDataTypesNewMethod(int a1, long b1, float c1, double d1, char e1)
    {
        System.out.println(a1);
        System.out.println(b1);
        System.out.printf("%.2f %n", c1);
        System.out.printf("%.4f %n", d1);
        System.out.println(e1);
    }

    public static void main(String[] args) {
        printDataTypes(2,231235123 ,1.21f, 543.1321 ,'c');
        System.out.println("--------------------");
        printDataTypesNewMethod(2,231235123 ,1.21f, 543.1321 ,'c');

        double value = 200.3456;
        System.out.printf("Value: %.2f", value);
        System.out.println();

        String result = String.format("%.2f", value);
        System.out.println(result);

    }
}
