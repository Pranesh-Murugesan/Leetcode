class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxCandie){
                maxCandie = candies[i];
            }
        }
        List <Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= maxCandie){
                result.add(true);
            }else{
                result.add(false);
            }
    }
    return result;
}
}