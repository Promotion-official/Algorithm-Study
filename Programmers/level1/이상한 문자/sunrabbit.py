def solution(s):
    stream = s.split(" ")
    new_stream = ""
    for i in stream:
        for idx, j in enumerate(i):
            if(idx % 2 == 0):
                new_stream += j.upper()
            else:
                new_stream += j.lower()
        new_stream += " "
    return new_stream[:-1]
# 풀기

def solution2(s):
    return " ".join(map(lambda x : "".join([i.lower() if idx % 2 == 1 else i.upper() for idx, i in enumerate(x)]), s.split(" ")))
  # 풀고 난 뒤 코드 고치기
