def solution(progresses, speeds):
    answer = []
    while progresses != []:
        for i in range(len(progresses)):
            progresses[i] += speeds[i]
        j = 0
        try:
            while progresses[0] >= 100:
                progresses.pop(0)
                speeds.pop(0)
                j += 1
        except:
            pass
        if j != 0:
            answer.append(j)
    return answer
  
