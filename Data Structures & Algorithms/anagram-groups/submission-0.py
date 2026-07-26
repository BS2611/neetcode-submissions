class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        val_map = dict()
        for str in strs:
            sorted_str = "".join(sorted(str))
            if sorted_str not in val_map:
                val_map[sorted_str] = [str]
            else:
                val_map[sorted_str].append(str)
        result = list()
        for item in val_map:
            if val_map[item]:
                temp = val_map[item]
                
                result.append(temp)
            
        return result

                

        