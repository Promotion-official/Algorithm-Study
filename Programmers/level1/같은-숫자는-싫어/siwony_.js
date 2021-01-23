function solution(arr)
{
    let answer = [];
    let temp;
    for(let i = 0; i < arr.length; i++){
        if(temp !== arr[i]) {
            temp = arr[i]
            answer[answer.length] = temp;
        }
    }   
    return answer
}

/***테스트 코드***/
console.log(solution([1, 1, 3, 3, 0, 1, 1]))
console.log(solution([4, 4, 4, 3, 3]))