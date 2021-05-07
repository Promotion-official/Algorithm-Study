function solution(s) {
  function pal(i, j) {
    let left = i - 1;
    let right = s[j] ? j + 1 : i + 1;
    let count = s[j] ? 2 : 1;
    while (s[left] && s[right] && s[left] === s[right]) {
      count += 2;
      left--;
      right++;
    }
    return count;
  }
  let answer = 1;
  for (let i = 0; i < s.length; i++) {
    if (s[i + 1] === s[i - 1] && s[i] === s[i + 1]) {
      const count = Math.max(pal(i), pal(i, i + 1));
      if (count > answer) answer = count;
    } else if (s[i + 1] === s[i - 1]) {
      const count = pal(i);
      if (count > answer) answer = count;
    } else if (s[i] === s[i + 1]) {
      const count = pal(i, i + 1);
      if (count > answer) answer = count;
    }
  }
  return answer;
}
