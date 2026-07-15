class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        x = zip(position,speed)
        data=sorted(x , key = lambda x : x[0],reverse=True)
        L=[]
        for i in range(len(data)):
            time=(target-data[i][0])/data[i][1]
            if L!=[] and time<=L[-1]:
                pass
            else:
                L.append(time)
        return len(L)