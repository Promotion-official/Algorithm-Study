def solution(n):
    answer = []
    for i in range(len(str(n))):
        answer.append(int(str(n)[i]))
    return list(reversed(answer))

#### 테스트 코드 ####
print(solution(12345))