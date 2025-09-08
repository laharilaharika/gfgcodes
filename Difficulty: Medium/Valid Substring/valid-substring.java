class Solution {
    public int maxLength(String s) {
        // code here
         Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        
        int n = s.length(), count = 0;
        
        for(int i=0; i<n; i++) {
            char curr = s.charAt(i);
            
            if(curr == '(') {
                stack.push(i);
            } else {
                stack.pop();
                
                if(!stack.isEmpty()) {
                    count = Math.max(count, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }
        
        return count;
    }
}