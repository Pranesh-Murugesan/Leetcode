
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> seen = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
