function solution(s) {
  const p = s.split("").filter((v) => ["p", "P"].includes(v));
  const y = s.split("").filter((v) => ["y", "Y"].includes(v));
  return p.length === y.length;
}
