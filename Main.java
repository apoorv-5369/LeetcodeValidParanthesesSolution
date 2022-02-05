class Solution {
    public boolean isValid(String s) {
        int n=s.length(); // Initializing an Integer n to store the value of the length of the given string.
        Stack<Character> st=new Stack<>(); // Initializing a stack of characters to store the parantheses.
        // Iterating through the given string.
        for(int i=0;i<n;i++){
           char c=s.charAt(i); // Inititalizing a character c to store the ith character in the given string.
            // 1. Checking if the ith character is an open bracket, if so then push the closing bracket into the stack.
            // 2. Also, Checking if the stack is Empty, or the element popped from the stack is unequal to the ith character, if so then return false. 
            if(c=='('){ 
                st.push(')');
            }else if(c=='{'){
                st.push('}');
            }else if(c=='['){
                st.push(']');
            }else if(st.isEmpty()||st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty(); // Returning the boolean st.isEmpty, since if so it means all parantheses are valid, otherwise invalid.
    }
}
