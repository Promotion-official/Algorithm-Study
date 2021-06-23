function solution(s, n) {
  return s
    .split("")
    .map((number) => {
      if (number === " ") return number;
      return number.toUpperCase().charCodeAt() + n > 90
        ? String.fromCharCode(number.charCodeAt() + n - 26)
        : String.fromCharCode(number.charCodeAt() + n);
    })
    .join("");
}
