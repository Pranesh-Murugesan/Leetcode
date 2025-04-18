class Solution {
    public int lengthOfLastWord(String s) {
    String str = s.trim().replaceAll("\\s+"," ");
    int whitespace =0;
    for(int i = 0;i<str.length();i++){
        if(str.charAt(i)==' '){
            whitespace ++;
        }
    }
        int [] arr = new int[whitespace];
        int index=0;
        for(int i = 0;i<str.length();i++){
        if(str.charAt(i)==' '){
        arr[index++] = i;
    }
    }
    if(arr.length==0){
        return str.length();
    }
int count = arr[arr.length -1];
return str.length ()- count - 1;
    }
}