function solution(a, b) {
  a > b && ([a, b] = [b, a]);
  return Array(b - a + 1)
    .fill()
    .map((v, i) => v + i)
    .reduce((a, c) => a + c);
}
