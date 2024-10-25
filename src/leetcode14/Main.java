package leetcode14;

public class Main {
    public static void main(String[] args){
        String[] strs = new String[]{"friend","flight","fight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String sh = strs[0];
        for (int j = 0;j<sh.length();j++){
            for (String str : strs){
                if(j == str.length() || str.charAt(j) != sh.charAt(j)) return sh.substring(0, j);
            }
        }
        return sh;
    }
}
