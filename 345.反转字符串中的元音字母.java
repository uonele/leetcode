import java.util.HashSet;
/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();

        HashSet<Character> set = new HashSet<Character>();
        char[] cs = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(char c : cs){
            set.add(c);
        }
        while(i < j){
            while(i < j && !set.contains(chars[j])){
                j--;
            }
            while(i < j && !set.contains(chars[i])){
                i++;
            }
            // 这个if是可有可无的，可以删掉if，直接进行交换，提交后仍可以AC
            if(i < j){  
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
            }
            j--;
            i++;
        }
       // return chars.toString();  会返回这玩意: "[C@3c0f93f1"
        return String.valueOf(chars);
    }
}
// @lc code=end

