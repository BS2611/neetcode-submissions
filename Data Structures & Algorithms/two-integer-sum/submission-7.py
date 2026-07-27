class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        val_map = dict()
        for  i in  range(0,len(nums)):
            if target - nums[i] in val_map:
                return [val_map[target - nums[i]],i]
            else:
                val_map[nums[i]] = i
        