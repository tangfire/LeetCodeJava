package leetcode17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    private char[] digits;

    private List<String> ans;

    private char[] path;

    public List<String> letterCombinations(String digits) {
        this.digits = digits.toCharArray();
        this.path = new char[digits.length()];
        ans = new ArrayList<>();
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        dfs(0);
        return ans;
    }


    private void dfs(int i){
        if (i == digits.length){
            ans.add(new String(path));
            return;
        }

        for (char c : mapping[digits[i]-'0'].toCharArray() ){
            path[i] = c;
            dfs(i+1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }

}
