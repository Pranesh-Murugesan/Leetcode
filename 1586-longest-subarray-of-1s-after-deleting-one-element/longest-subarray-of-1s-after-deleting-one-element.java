public class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            int currentLength = right - left;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            right++;
        }

        if (maxLength == nums.length) {
            maxLength--;
        }

        return maxLength;
    }
}
