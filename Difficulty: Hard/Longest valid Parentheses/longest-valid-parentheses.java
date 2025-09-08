class Solution {
    static int maxLength(String s) {
        // code here
        Deque<Integer> st = new ArrayDeque<Integer>();
        int max_count = 0;
        int count = 0;
        st.push(0);
        for(int i = 1 ; i < s.length() ; i++){
            count = 0;
            if(!st.isEmpty() && s.charAt(i) == ')'&& s.charAt(st.peek()) == '(' ){
                st.pop();
                if(!st.isEmpty()){
                    count = i - st.peek();
                }else{
                    count = i+1;
                }
            }else{
                st.push(i);
            }
            max_count = Math.max(count,max_count);
        }
        return max_count;
    }
}