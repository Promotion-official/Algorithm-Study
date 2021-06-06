def solution(arr1, arr2):
    return [list(map(lambda x, y: x + y, i, j)) for i, j in zip(arr1, arr2)]
  
