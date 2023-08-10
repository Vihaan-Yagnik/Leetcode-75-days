class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] str = s.toCharArray();
        StringBuilder store = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(str[i] != '*'){
                st.push(str[i]);
            }
            else if(str[i] == '*' && !st.isEmpty()){
                st.pop();
            }
            i++;
        }
        while(!st.isEmpty()){
            store.append(st.pop());
        }
        return store.reverse().toString();
    }
}
