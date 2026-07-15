class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> indices = new HashMap<>();  // val -> index
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int a = target - nums[i];
            if(indices.containsKey(a) && indices.get(a) != i){
                return new int[]{i, indices.get(a)};
            }
        }
return new int[0];
        }
}
