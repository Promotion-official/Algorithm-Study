#def digit_sum(x):
#    sum=0
#    while x>0:
#        sum+=x%10
#        x=x//10
#    return sum

#def solution(x):
#    return x % digit_sum(x) == 0

def solution(x):
    return x % sum([int(y) for y in str(x)]) == 0
  
