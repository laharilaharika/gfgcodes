class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        for(String s:arr){
            if(s.equals("*")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a*b);
            }
            else if(s.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else if(s.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a+b);
            }
            else if(s.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }
            else {
            stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}