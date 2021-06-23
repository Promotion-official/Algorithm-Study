function solution(x, n) {
  return Array.from({ length: n }, (_, i) => i * x + x);
}
