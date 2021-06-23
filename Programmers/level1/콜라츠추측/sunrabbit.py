# def solution(num):
#     if num == 1:
#         return 0
#     answer = 0
#     while num != 1:
#         answer += 1
#         if(answer == 500):
#             return -1
#         if(num % 2 == 0):
#             num = firstCondition(num)
#         else:
#             num = secondCondition(num)
#     return answer

# def firstCondition(num):
#     return num / 2

# def secondCondition(num):
#     return num * 3 + 1

def solution(num):
    for i in range(500):
        num = num / 2 if num % 2 == 0 else num*3+1
        if(num == 1):
            return i + 1
    return -1
  
