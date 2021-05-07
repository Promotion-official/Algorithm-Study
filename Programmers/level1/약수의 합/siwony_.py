def solution(n):
    answer=0
    for i in range(1, n // 2 + 1):   # 약수의 절반이상부터 약수가 없음
        answer += i if n % i == 0 else 0
    return answer + n

#### 테스트 코드 ####
print(solution(12))