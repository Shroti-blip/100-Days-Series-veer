//method for counting digits;

function countDigit(num){
    if(num == 0) 
        return 0;
    return 1 + countDigit(Math.floor(num / 10));
}
 
 const powerSum = (num , digits) => {
    if(num == 0)
        return 0;
    let digit = num % 10;
    return Math.pow(digit , digits) + powerSum(Math.floor(num / 10) , digits)
 }


 //main function to check armstrong number

 function isArmstrong(num){
    let digits = countDigit(num);
    let sum = powerSum(num , digits);
    return sum == num

 }

let num = 153


if(isArmstrong(num)){
    console.log(num + " is an Armstrong Number.")
}
else{
    console.log(num + " is not a Armstrong number.")
}