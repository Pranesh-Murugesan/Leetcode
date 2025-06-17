class Solution {
    public boolean checkIfPangram(String sentence) {
     boolean[] res = new boolean[26];
     for(char ch : sentence.toCharArray()){
        res[ch -'a'] = true;
     }
     for(boolean result:res){
        if(!result){
            return false;
        }
     }
     return true;
    }
}