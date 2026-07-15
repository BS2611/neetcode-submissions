class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> indices = new HashMap<>();  // val -> index
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if(indices.containsKey(a)){
                indices.put(a, indices.get(a)+1);
            }else{
                indices.put(a, 1);
            }
        }
        int[] result = new int[k];
        
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(indices.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

    return result;
    }
}
