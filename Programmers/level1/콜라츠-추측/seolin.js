function solution(num) {
  let cnt = 0;
  return collatz(num, cnt);
}

function collatz(num, cnt) {
  if (cnt > 499) return -1;
  if (num === 1) return cnt;
  num = num % 2 ? num * 3 + 1 : num / 2;
  return collatz(num, ++cnt);
}
