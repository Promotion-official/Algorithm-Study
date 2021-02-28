def solution(strings, n):
    return list(sorted(sorted(strings),key = lambda x : x[n],reverse = False))
    
