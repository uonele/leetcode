/*
 * @lc app=leetcode.cn id=468 lang=java
 *
 * [468] 验证IP地址
 */

// @lc code=start
class Solution {
    public String validIPAddress(String queryIP) {
        if(isIPv4(queryIP)){
            return "IPv4";
        }else if(isIPv6(queryIP)){
            return "IPv6";
        }else{
            return "Neither";
        }
    }

    public boolean isIPv4(String str){

        //
        //
        // 对比的时候需要注意 ‘.’是字符，"."是字符串
        if(str.length() < 7 || str.length() > 15 || str.charAt(str.length() - 1) == '.'){
            return false;
        }

        // 两个需要注意的点   一个是trim， 一个是\\.   为啥用\\. 因为split方法里用的是re
        String[] strs = str.trim().split("\\.");

        if(strs.length != 4) return false;

        for(String s : strs){
            if(s.length() == 0 || s.length() > 3 || s.charAt(0) == '0' && s.length() > 1 ){
                return false;
            }
            int sum = 0;
            char[] chars = s.toCharArray();
            for(char c : chars){
                if(c >= '0' && c <= '9'){
                    int temp = c - '0';
                    sum = sum * 10 + temp;
                }else{
                    return false;
                }
            }

            if(sum > 255){
                return false;
            }
            
        }
        return true;
    }

    public boolean isIPv6(String IP){
        String[] strings = IP.trim().split(":");
        if(strings.length!=8||IP.charAt(IP.length()-1)==':') return false;
        for (String s:strings){
            char[] chars = s.toCharArray();
            if(s.length()<1||s.length()>4) return false;
            for (char c:chars){
                if((c<'0')||(c>'9'&&c<'A')||(c>'F'&&c<'a')||(c>'f')){
                    return false;
                }
            }
        }
        return true;
        //return true;
    }

}
// @lc code=end

