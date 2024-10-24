package leetcode13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = s.length();
        int res = 0;
        for (int i = 0;i<len;i++){
            if(i < len-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res -= map.get(s.charAt(i));
            }else{
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }
}
