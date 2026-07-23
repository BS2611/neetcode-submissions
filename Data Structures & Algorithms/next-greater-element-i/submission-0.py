class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = [-1]*len(nums1)
        for i in range(0,len(nums1)):
            idx = nums2.index(nums1[i])
            for j in range(idx,len(nums2)):
                if nums2[j]>nums2[idx]:
                    result[i] = nums2[j]
                    break
                    
        
        return result