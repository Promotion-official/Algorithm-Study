function solution(n) {
  var answer = "";
  for (var i = 0; i < n; i++) answer += i % 2 === 0 ? "수" : "박";
  return answer;
}

//아니 애들 코드 뭔데 초라해지잖아 나
