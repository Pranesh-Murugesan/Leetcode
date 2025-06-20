class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total =m+n;
        int [] result = new int[total];
        for(int i =0;i<m;i++){
            result[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            result[j+m] = nums2[j];
        }
      Arrays.sort(result);
      for(int i =0;i<total;i++){
        nums1[i] =result[i];
      }
    }
}