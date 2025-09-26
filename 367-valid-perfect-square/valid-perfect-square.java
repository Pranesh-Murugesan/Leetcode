class Solution {
    public boolean isPerfectSquare(int num) {
     int x=num/2;
     if(num==1){
        return true;
     }
     for(int i=1;i<=x;i++){
        if(i*i==num){
            return true;
        }
     }   
     return false;
    }
}