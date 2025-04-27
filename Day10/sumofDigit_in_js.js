function sumof_Digit(num){
    sum = 0;
    while(num != 0){
        sum = sum + num % 10;
      num =  Math.floor(num / 10);// for avoiding decimals.
    }
    return sum;
}
let num = 23433;
let store = sumof_Digit(num)
console.log("Sum of Digits are: " + store)

