function solution(arr, divisor) {
  const answer = arr.filter((el) => el % divisor === 0);
  return answer.length ? answer.sort((p, c) => p - c) : [-1];
}

// .filter는 신이다.
