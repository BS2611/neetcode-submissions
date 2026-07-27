class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        hash_map = dict()

        for num in nums:
            if num in hash_map:
                hash_map[num] = hash_map[num]+1
            else:
                hash_map[num] = 1
        
        count_0 = hash_map.get(0, 0)
        count_1 = hash_map.get(1, 0)
        count_2 = hash_map.get(2, 0)
        idx=0
        for i in range(0, count_0):
            nums[idx] = 0
            idx+=1
        
        for i in range(0, count_1):
            nums[idx] = 1
            idx+=1
        
        for i in range(0, count_2):
            nums[idx] = 2
            idx+=1
        
        
        

        