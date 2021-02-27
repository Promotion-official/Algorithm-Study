def solution(board, moves):
    moved = [0]
    answer = 0
    for i in moves:
        for j in board:
            if j[i-1] != 0:
                moved.append(j[i-1])
                j[i-1] = 0
                try:
                    if moved[-1] == moved[-2]:
                        moved.pop()
                        moved.pop()
                        answer+=2
                except(IndexError):
                    break
                break
    
                
    return answer
  
