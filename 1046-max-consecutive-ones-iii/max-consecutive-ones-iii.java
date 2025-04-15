class Solution {
    public int longestOnes(int[] nums, int k) {
    int left=0;
    int right =0;
    int zerovalue=0;
    int maxlength =0;
    while(right<nums.length){
        if(nums[right]==0){
            zerovalue ++;
        }
        while(zerovalue > k){
            if(nums[left]==0){
                zerovalue--;
            }
            left++;
        }
    int length = right -left +1;
    if(length>maxlength){
        maxlength = length;
    }
    right++;
    } 
    return maxlength;
    }
}