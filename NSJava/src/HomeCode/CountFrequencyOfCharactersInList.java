package HomeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountFrequencyOfCharactersInList
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        clist.add(c);
        System.out.println("Array List: " + clist);
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        //System.out.println("clist Character: ");
        int count = 0;
        for(Character temp : clist)
        {
            if(c == temp)
                count++;
        }
        System.out.println("Frequency Of Character" + c + " =" + count);
    }
    public static void main(String[] args) {
        ArrayList<Character> l1 = new ArrayList<>();

        insert(l1,'v');
        insert(l1,'q');
        insert(l1,'r');
        insert(l1,'q');
        freq(l1,'q');

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(55);
        list.add(34);
        list.add(98);
        list.add(67);
        list.add(39);
        list.add(76);
        list.add(81);
        Collections.sort(list);
        System.out.println("List: " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("RevList: " + list);
    }
}
