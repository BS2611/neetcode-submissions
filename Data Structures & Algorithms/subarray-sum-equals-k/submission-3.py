class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        nums_set = set(nums)
        val =0
        prefixSum = [0] * len(nums)

    # initialize the first element
        prefixSum[0] = nums[0]
        hashmap = {0:1}
        current_sum =0
        answer =0
    # Adding present element with previous element
        for i in range(1, len(nums)):
            prefixSum[i] = prefixSum[i - 1] + nums[i]

        
        for i in range(0, len(nums)):
            current_sum+=nums[i]
            if current_sum-k  in hashmap:
                answer+=hashmap[ current_sum-k]
            if current_sum in hashmap:
                hashmap[current_sum] =1 +hashmap[current_sum]
            else:
                hashmap[current_sum] =1
        return answer