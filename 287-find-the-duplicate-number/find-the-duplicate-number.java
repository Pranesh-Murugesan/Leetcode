class Solution {
    public int findDuplicate(int[] nums) {
    int s=0;
    Set<Integer> res= new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(res.contains(nums[i])){
            s=nums[i];
            break;
        }else
        {
            res.add(nums[i]);
        }
    } 
    return s;
    }
}