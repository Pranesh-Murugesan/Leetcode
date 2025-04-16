class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getCommon(nums1 , nums2),(getCommon(nums2, nums1)));
    }
    private List<Integer> getCommon(int []num1 ,int[] num2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0;i<num2.length;i++){
            set2.add(num2[i]);
        }
        for(int i=0;i<num1.length;i++){
            if(!set2.contains(num1[i])){
                set1.add(num1[i]);
            }
        }
        return new ArrayList<>(set1);
    }
}