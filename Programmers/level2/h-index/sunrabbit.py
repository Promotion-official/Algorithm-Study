# def solution(citations):
#     return max(map(min, enumerate(sorted(citations, reverse=True), start=1)))

def solution(citations):
    citations.sort(reverse=True)
    count = 1
    h_index = []
    for i in citations:
        h_index.append(min(count, i))
        count += 1
    return max(h_index)
            
