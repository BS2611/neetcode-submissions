class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> list = new Stack<>();
        int[][] pair = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];    
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        for(int p[]:pair){
            double val = (double)(target-p[0])/p[1];
            list.push(val);
            if(list.size()>=2 && list.peek()<= list.get(list.size()-2)){
                list.pop();
            }
        }

        return list.size();

    }
}
