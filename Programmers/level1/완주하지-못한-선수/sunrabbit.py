def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for parm, com in zip(participant, completion):
        if parm != com:
            return parm
    return participant[-1]
    
