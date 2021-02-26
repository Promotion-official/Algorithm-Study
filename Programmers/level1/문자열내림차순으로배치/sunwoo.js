function solution(s) {
  return s
    .split("")
    .sort((prev, cur) => cur.charCodeAt() - prev.charCodeAt())
    .join("");
}
