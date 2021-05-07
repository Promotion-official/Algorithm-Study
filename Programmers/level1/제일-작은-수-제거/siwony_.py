def solution(arr):
    arr.remove(min(arr))
    return [-1] if len(arr) <= 1 else arr

####테스트코드####
print(solution([4,3,2,1]))
print(solution([10]))