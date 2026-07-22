class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        min_index =-1
        
        for i in range(len(nums)-2,-1,-1):
            if(nums[i]<nums[i+1]):
                min_index = i
                break
        if min_index == -1:
            nums.sort()
            return
        min_val = max_int = 10**18 
        index = -1
        for i in range(min_index,len(nums)):
            if(min_val>nums[i] and nums[i]>nums[min_index]):
                min_val = nums[i]
                index =i
        
        
        temp= nums[index]
        nums[index] = nums[min_index]
        nums[min_index] = temp
            

        nums[min_index+1:] = sorted(nums[min_index+1:])
