package String.Modifying;

//import java.sql.SQLOutput;

public class stringComparison {
    public static void main(String[] args) {
        System.out.println("Hello Java World!");
        String st1 = "Java";
        String st2 = "Java";
        String st4 = "Java is a famous programming language";
        String str3= "Python";
        //String1.equals(String2) Syntax return true if equal else false
        boolean cmp12 = st1.equals(st2);
        boolean cmp13 = st1.equals(str3);
        boolean cmp23 = st2.equals(str3);
        boolean cmp14 = st1.equals(st4);
        System.out.println("equals: " + "cmp12: " + cmp12 + " cmp13: " + cmp13 + " cmp23: " + cmp13 + " cmp14:" + cmp14);

        //String1.startsWith(String2) Syntax return true if String1 is started with String2  else false
        boolean start42 = st4.startsWith(st2);
        boolean started24 = st2.startsWith(st4);
        boolean started43 = st4.startsWith(str3);
        System.out.println("startsWith: " + "start42:" + start42  + " started24:" + started24 + " started43:" + started43);

        //String1.endsWith(String2) if string1 ends with String2 then return true else false
        String end = "Language in Programming Which one is best Python or Java";
        boolean endresult = end.endsWith(st2);
        boolean endresultfalse = end.endsWith(str3);
        System.out.println("endsWith: " + "endresult: " + endresult + " endresultfalse:" + endresultfalse );

        //String1.compareTo(String2) result => +ve, OR , -ve, OR , 0
        int cmpt12 = st1.compareTo(st2);
        int cmp24 = st2.compareTo(st4);
        int cmpt23 = str3.compareTo(st2);
        System.out.println("compareTo:" + " cmpt12:" + cmpt12 + " cmp24:"+ cmp24 + " cmpt23:" + cmpt23 );




    }
}
