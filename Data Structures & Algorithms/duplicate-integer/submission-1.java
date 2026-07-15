class Solution {
    public boolean hasDuplicate(int[] nums) {
        int left = 0, right = 1;
        Arrays.sort(nums);
        while(right<nums.length){
            if(nums[left]  != nums[right]){
                left++;
                nums[left] = nums[right];
            }else{
                return true;
            }
            right++;
           
        }
        return false;//index starts from 0 and for length we have to increment it by 1 
    }
    
}