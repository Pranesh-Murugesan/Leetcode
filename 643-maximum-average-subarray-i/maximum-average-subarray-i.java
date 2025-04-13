class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int Max_sum = 0;
    int Current_sum=0;
    for(int i =0;i<k;i++){
        Current_sum = Current_sum + nums[i];
    }  
    Max_sum = Current_sum;
    for(int i =k;i<nums.length;i++){
        Current_sum = Current_sum+ nums[i] - nums[i-k];
    if(Current_sum > Max_sum){
        Max_sum = Current_sum;
    }
    }
    return (double) Max_sum/k;
    }
}