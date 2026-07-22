class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for i in range(1,numRows):
            prevRow  = result[i-1]
            newRow =[1]
            for j in range(1, len(prevRow)):
                newRow.append(prevRow[j] +prevRow[j-1])
            newRow.append(1)
            result.append(newRow)
        return result

        