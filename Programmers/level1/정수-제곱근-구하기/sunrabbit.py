def solution(n):
    sqrt = n ** (1/2)
    
    
    if n == 1: return 4
    if sqrt % 1 != 0:
        return -1
    return (sqrt + 1) ** 2
  
