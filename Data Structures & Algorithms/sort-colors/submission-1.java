class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white =0;
        int blue =0;
        for (int n:nums){
            if(n == 0 ){
                red++;
            }else if(n==1){
                white++;
            
            }else if(n==2){
                blue++;
            }
        }
        int i =0;
        while(red>=1 && i<nums.length){
            nums[i] =0;
            i++;
            red--;
        }
        while(white>=1 && i<nums.length){
            nums[i] =1;
            i++;
            white--;
        }
        while(blue>=1 && i<nums.length){
            nums[i] =2;
            i++;
            blue--;
        }
    }
}