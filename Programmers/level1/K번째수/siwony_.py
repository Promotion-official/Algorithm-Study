def solution(arr, commands):
    answer = []
    for com in commands:
        sort_arr = sorted((arr[com[0] - 1 : com[1]]))
        answer.append(sort_arr[com[2] - 1])
    return answer
####테스트 코드####
print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))