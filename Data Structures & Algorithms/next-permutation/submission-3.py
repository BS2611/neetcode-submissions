class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        
        # Step 1: find pivot (rightmost index where nums[i] < nums[i+1])
        pivot = -1
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                pivot = i
                break
        
        # No pivot found -> array is fully descending -> wrap to smallest
        if pivot == -1:
            nums.sort()
            return
        
        # Step 2: find smallest value in suffix that's still greater than nums[pivot]
        swap_val = float('inf')
        swap_idx = -1
        for i in range(pivot, n):
            if nums[pivot] < nums[i] < swap_val:
                swap_val = nums[i]
                swap_idx = i
        
        # Step 3: swap pivot with that value
        nums[pivot], nums[swap_idx] = nums[swap_idx], nums[pivot]
        
        # Step 4: sort suffix ascending (smallest arrangement)
        nums[pivot + 1:] = sorted(nums[pivot + 1:])