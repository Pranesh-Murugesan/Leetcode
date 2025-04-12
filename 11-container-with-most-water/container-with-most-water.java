class Solution {
    public int maxArea(int[] height) {
    int left =0;
    int right = height.length-1;
    int maxArea = 0;
    while(left<right){
        int h ;
        if(height[left]<height[right]){
            h = height[left];
        }else{
            h = height[right];
        }
        int width = right - left;
        int area = h* width;
        if(area >maxArea ){
            maxArea= area;
        }
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    } 
    return maxArea; 
    }
}