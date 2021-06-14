function solution(arr) {
  return arr.filter((a, i) => a !== arr[i + 1]);
}
