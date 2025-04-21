class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!= t.length()){
    return false;
}
int []words = new int[26];
for(int i =0; i<s.length();i++){
    words[s.charAt(i)-'a']++;
    words[t.charAt(i) -'a']--;
}
for(int nums : words)
if(nums!=0){
    return false;
}
return true;    
    }
}