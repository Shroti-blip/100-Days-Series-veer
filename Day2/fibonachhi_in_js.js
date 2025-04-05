function fibonachhi(num){
let firstNum = 0;
let secondNum = 1;
let sum = 0;

for(let i = 1; i<=num; i++){
    sum = firstNum + secondNum;
    console.log(sum);
    firstNum = secondNum;
    secondNum = sum;
}
}

let num = 10;
fibonachhi(num)