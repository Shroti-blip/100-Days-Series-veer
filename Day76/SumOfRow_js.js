const sum = (arr) => {
let sum =0;
let idx =2;
    for(let i=0; i<=arr[idx].length-1; i++){
        sum += arr[idx][i];
        console.log(sum)
    }
    return sum;
}

let arr = [
    [1,2,3],
    [5,3,7],
    [8,6,0]
]

let res = sum(arr);
console.log(res);