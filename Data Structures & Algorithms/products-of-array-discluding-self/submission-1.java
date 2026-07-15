class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p=new int[nums.length];
        int product =1,p0=1, zeroCount = 0;
        for(int n :nums){
            if(n!=0) {
                product*=n;
            } else {
                zeroCount++;
            }
            p0*=n;
        }
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(n!=0){
                p[i] = p0/n;
            }else{
                p[i] = (zeroCount > 1) ? 0 : product;
            }
        }
        return p;
    }
}