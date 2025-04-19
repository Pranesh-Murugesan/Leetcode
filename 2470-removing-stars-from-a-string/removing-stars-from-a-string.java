class Solution {
    public String removeStars(String s) {
    Stack<Character> S = new Stack<>();
    for(int i =0; i<s.length();i++){
       char ch = s.charAt(i);
       if(ch=='*'){
            if(!S.isEmpty()){
                S.pop();
            }
       }
       else{
            S.push(ch);
    }
    }
       StringBuilder ans = new StringBuilder();
       for(char ch:S){
        ans.append(ch);
       }
       return ans.toString();
    
}
}