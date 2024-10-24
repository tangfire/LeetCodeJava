package leetcode1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};

        int target = 9;

        int[] map = twoSum(nums,target);
        for (int i:map){
            System.out.println(i);
        }



    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
