package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateAnArray {
    public static void duplicates(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        int i =0;
       while(n-1 >=i){
            int k =0;
           if(mp.containsKey(arr[i]))
                k = mp.get(arr[i]);
            mp.put(arr[i],++k);
            if(mp.get(arr[i]) > 1 && !ans.contains(arr[i]))
                ans.add(arr[i]);
           i++;
        }
        if(ans.size() == 0)
            ans.add(-1);
        Collections.sort(ans);          //DUe to sorting O(n*log n) time b  ut can be solved in O(n) time
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
      // return Collections.sort(ans);
    }

    public static void main(String[] args) {
        int[] a= {26,13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3 ,8, 11, 25, 10, 3 ,15 ,11, 19, 20, 2, 4 ,25, 14, 23, 14};
        int n = a.length;
        //ArrayList<Integer> al = new ArrayList<>();
        duplicates(a,n);
//        for (int num:al
//             ) {
//            System.out.print(num + " ");
//        }
    }
}
