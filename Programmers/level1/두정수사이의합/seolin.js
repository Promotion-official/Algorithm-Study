function solution(a, b) {
  var answer = 0;
  if (a > b) {
    [a, b] = [b, a];
  }
  for (a; a <= b; a++) answer += a;
  return answer;
}
