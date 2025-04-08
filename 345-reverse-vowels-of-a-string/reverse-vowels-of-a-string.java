class Solution {
    public String reverseVowels(String s) {
        int i =0;
        int j= s.length()-1;
        char word [] = s.toCharArray();
        while(i<j){
            if(! isVowel(word[i])){
                i++;
            }else if(! isVowel(word[j])){
                j--;
            }else{
                char temp = word[i];
                word[i]= word[j];
                word[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(word);
    }

    public boolean isVowel(char ch){
        if(ch== 'a' || ch== 'e' || ch== 'i'||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }
}