def solution(n):
    answer = ""
    for i in (range(n)):
        answer += "수" if i % 2 == 0 else "박"
    return answer
###테스트코드###
print(solution(4))
print(solution(5))