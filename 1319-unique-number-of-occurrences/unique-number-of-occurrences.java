class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    if(arr.length==0){
        return false;
    }  
    Map<Integer,Integer > num = new HashMap<>();
    for(int i =0;i<arr.length;i++){
        if(num.containsKey(arr[i])){
            num.put(arr[i],num.get(arr[i])+1);
        }else{
            num.put(arr[i],1);
        }
    }
    Set<Integer> set = new HashSet<>(num.values());
    if(num.size()==set.size()){
        return true;
    }
    return false;
    }
}