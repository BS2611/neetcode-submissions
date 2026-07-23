class MinStack:

    def __init__(self):
        self.lst = list()

    def push(self, val: int) -> None:
        self.lst.append(val)

        

    def pop(self) -> None:
        if len(self.lst)>=1:
            self.lst.pop()

    def top(self) -> int:
        return self.lst[len(self.lst)-1]
        

    def getMin(self) -> int:
        min_val  = self.lst[0]
        for item in self.lst:
            min_val = min(min_val,item)
        return min_val

        
