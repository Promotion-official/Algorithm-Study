function solution(arr)
{
    let answer = [];
    answer = arr;
    for (let i = 0; i < answer.length; i++) {
        answer[i] == answer[i + 1] ? answer[i] = null : "" ;
    }
    answer = answer.filter(function(item) {return item !== null;});
    return answer;
}

solution(arr);
