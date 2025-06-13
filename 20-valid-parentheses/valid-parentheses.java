class Solution {
    public boolean isValid(String s) {
        Stack<Character>a= new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='[' || ch=='{'||ch=='('){
                a.push(ch);
            }else if(ch==')'|| ch =='}'||ch ==']'){
                if(a.isEmpty()){
                    return false;
                }
                char result = a.pop();
                if((ch=='}' && result !='{')||(ch==')' && result !='(')||(ch==']' && result !='[') ){
                    return false;
                }
            }
        }return a.isEmpty();
    }
}