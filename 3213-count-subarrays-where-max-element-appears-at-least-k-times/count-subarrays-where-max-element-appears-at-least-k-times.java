public class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        long count = 0;
        int left = 0, freq = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) {
                freq++;
            }
            while (freq >= k) {
                count += nums.length - right;
                if (nums[left] == max) {
                    freq--;
                }
                left++;
            }
        }
        return count;
    }
}
