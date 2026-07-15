class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> vals = new Stack<>();
        for(String token:tokens){
            if(!token.matches("\\D+")){
                vals.push(Integer.parseInt(token));
            }else{
                int secondVal = vals.pop();
                int firstVal = vals.pop();
                if(token.equals("+")){
                    vals.push(firstVal+ secondVal);
                }else if(token.equals("-")){
                    vals.push(firstVal- secondVal);
                }else if(token.equals("*")){
                    vals.push(firstVal* secondVal);
                }else  if(token.equals("/")){
                    vals.push(firstVal /secondVal);
                }
            }
        }
        return vals.pop();
    }
}
