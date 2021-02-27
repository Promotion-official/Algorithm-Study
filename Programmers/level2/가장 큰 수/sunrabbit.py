def solution(numbers):
    return ''.join(sorted(map(str,numbers),key = lambda x : x*3,reverse = True))
# 예시 코드
print(solution([3, 30, 34, 5, 9]))
