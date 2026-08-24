
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int num:nums){
           
                map.put(num, i);
                i++;
        }
        for( i=0;i< nums.length;i++){
            if(map.containsKey(target- nums[i]) && i !=map.get(target- nums[i])){
                return new int[] {i,map.get(target- nums[i])};
            }
        }
        return new int[]{};
    }
}
