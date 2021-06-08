function solution(s) {
  return /\D/.test(s) ? false : true && [4, 6].includes(s.length);
}
