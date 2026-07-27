class Solution:
    def isValid(self, s: str) -> bool:
        str_stack =list()
        if len(s)%2 !=0:
            return False
        for ch in s:
            if ch in "({[":
                str_stack.append(ch)
            elif ch in '])}':
                if str_stack:
                    if str_stack[-1] == '(' and ch !=  ')':
                        return False
                    elif  str_stack[-1] == '[' and ch !=  ']':
                        return False
                    elif str_stack[-1] == '{' and ch !=  '}':
                        return False
                    str_stack.pop()
                else:
                    return False
        if str_stack:
            return False
        else:
            return True