class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int ans [] = new int[n];
    int left =1;
    int right = 1;
    for(int  i= n-1;i>=0;i--){
        ans[i] = right;
         right = right * nums[i];
    }  
    for(int i =0;i<n;i++){
        ans[i] = ans[i]* left;
        left = left * nums[i];
    }  
    return ans;    
    }
}