class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result = [0] *len(temperatures)
        temp_stack = list()
        for i in range(0,len(temperatures)):
            if len(temp_stack) ==0:
                temp_stack.append(i)
            else:
                for j in range(len(temp_stack)-1,-1,-1):
                    
                    if temperatures[i]>temperatures[(temp_stack[j])]:
                        result[(temp_stack[j])] =  i - (temp_stack[j])
                        temp_stack.pop()
                temp_stack.append(i)
        return result


        