class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> safe = new Stack<>();
    for(int i: asteroids){
        boolean alive = true;
        while(alive && i<0 && !safe.isEmpty() && safe.peek()>0){
            if(safe.peek() < -i){
                safe.pop();
            }else if(safe.peek()== -i){
                safe.pop();
                alive = false;
            }else{
                alive = false;
            }
        }
        if(alive){
            safe.push(i);
        }
    }  
    int[] result = new int[safe.size()];
    for (int i = result.length - 1; i >= 0; i--){
        result[i] = safe.pop();
    }
     return result;
    }
}