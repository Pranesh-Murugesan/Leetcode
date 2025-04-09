class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split(" +");
        String reverseString = "";
        for(int i=words.length-1;i>=0;i--){
            reverseString = reverseString+ words[i];
            if(i!=0){
                reverseString = reverseString + " ";
            }
            
        }
        return reverseString;
    }
}