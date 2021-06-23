def gcd(i, j):
    return i if j == 0 else gcd(j, i % j)
    
def solution(n, m):
    gcd_value = gcd(n, m)
    return [gcd_value, n* m / gcd_value]
  
