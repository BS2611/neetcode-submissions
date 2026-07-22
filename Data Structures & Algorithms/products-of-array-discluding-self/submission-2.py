class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix_prod = [1]*len(nums)
        prefix_prod[0] =1 
        for i in range(1,len(nums)):
            prefix_prod[i] = prefix_prod[i-1] * nums[i-1]

        suffix_prod = [1]*len(nums)
        suffix_prod[0] =1 
        for i in range(len(nums)-2,-1,-1):
            suffix_prod[i] = suffix_prod[i+1] * nums[i+1]
        return [suffix_prod[i] * prefix_prod[i] for i in range(len(nums))]
            
        