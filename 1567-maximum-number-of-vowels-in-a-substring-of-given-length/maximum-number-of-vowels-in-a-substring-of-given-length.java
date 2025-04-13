public class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }
        }
        return maxVowels;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
