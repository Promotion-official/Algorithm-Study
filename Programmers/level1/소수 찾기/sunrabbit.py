def solution(n):
    num = set(range(2,n+1))

    for i in range(2,n+1): num -= set(range(2*i,n+1,i)) if i in num else set()
    return len(num)
  
