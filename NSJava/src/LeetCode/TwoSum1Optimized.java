package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1Optimized {
        public int[] twoSum(int[] numbs, int target) {
            Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
            mp.put(numbs[0],0);
            int[] res = {0,0};
            for(int i = 1 ; i< numbs.length ; i++)
            {
                if(!(mp.containsKey(target - numbs[i])))
                    mp.put(numbs[i],i);
                else
                {
                    res[0] = mp.get(target - numbs[i]);
                    res[1] = i;
                }
            }
            return res;
        }

    public static void main(String[] args) {
        int[] numbs = {2,7,11,15,23,14,53,4};
        int  target = 11;
        TwoSum1Optimized obj = new TwoSum1Optimized();
        int[] arr = new int[2];
        arr=obj.twoSum(numbs,target);
        System.out.println(arr[0] + " " + arr[1]);
    }
    }
