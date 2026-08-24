class MinStack {
    private ArrayList<Integer> stack;
    private int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        stack.add(val);
        min = Math.min(min,val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        min = Integer.MAX_VALUE;
        for(int num:stack){
            min = Math.min(num,min);
        }
        return min;
    }
}
