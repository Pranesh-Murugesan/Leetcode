
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left =0;int right =0;int max =0;
       Set<Character> res = new HashSet<>();
       while(right<s.length()){
        if(!res.contains(s.charAt(right))){
            res.add(s.charAt(right));
            right++;
        int currentWindow = right - left ;
                if (currentWindow > max) {
                    max = currentWindow;
            }
            } else{
            res.remove(s.charAt(left));
            left++;
        }
       }
       return max;
       }
}
