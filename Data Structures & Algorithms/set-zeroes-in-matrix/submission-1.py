class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        row0_has_zero= False
        col0_has_zero = False
        row0_has_zero = False
        for j in range(len(matrix[0])):
            if matrix[0][j] == 0:
                row0_has_zero = True
        for i in range(len(matrix)):
            if matrix[i][0] == 0:
                col0_has_zero = True
        
        for i in range(0,len(matrix)):
            for j in range(0,len(matrix[i])):
                if matrix[i][j] == 0:
                        matrix[i][0] =0
                        matrix[0][j] =0
                    
            
        for i in range(1,len(matrix)):
            for j in range(1,len(matrix[i])):
                if(matrix[0][j] == 0 or matrix[i][0] ==0):
                    matrix[i][j] =0

        for j in range(len(matrix[0])):
            if row0_has_zero is True:
                matrix[0][j] =0
        for i in range(len(matrix)):
            if col0_has_zero is True:
                matrix[i][0] =0
          
            


        
        