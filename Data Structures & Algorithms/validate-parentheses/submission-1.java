class Solution {
    public boolean isValid(String s) {

        //Stack<Character> stack = new Stack<>();

        //Deque is faster than stack
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            //For Opening Brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                // If the stack is empty and the selected char is a closing bracket, then it  means that their is no opening bracket related to it
                char topOpen = stack.pop();//selecting the last item added into the stack
                if (topOpen == '{' && c != '}')
                    return false;
                if (topOpen == '(' && c != ')')
                    return false;
                if (topOpen == '[' && c != ']')
                    return false;
                /* As we are using a stack which is a LIFO structure so the last added open bracket would be released and as we are going to the next index it should return the corresponding bracket */
            }
        }
        return stack.isEmpty();// If all brackets matches then stack will be empty
    }
}