class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = 0;
        for(int i : candies){
            maxCandie = Math.max(maxCandie,i);
        }
        List <Boolean> result = new ArrayList<>();
        for(int i : candies){
            if(i + extraCandies >= maxCandie){
                result.add(true);
            }else{
                result.add(false);
            }
    }
    return result;
}
}