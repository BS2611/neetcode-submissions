class Solution {
    public void sortColors(int[] nums) {
        /*
         nums =[1,0,1,2]
         left side will have 0 elems
         right side would have 2 

        */
        int  l=0;
        int r = nums.length-1;
        int i =0;
        while(i<=r){
            if (nums[i] ==0){
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i]  = temp;
                l++;
            }else if(nums[i] ==2){
                int temp = nums[r];
                nums[r] = nums[i];
                nums[i]  = temp;
                r--;
                i--;
            }
            i++;
        }
    }
}