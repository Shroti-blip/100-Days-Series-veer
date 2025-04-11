function gcd(num1, num2){
       //Function to calculate GCD using the Euclidean algorithm
    while(num2!=0){
        let remainder = num1%num2;
        num1 = num2;
        num2 = remainder;
    }
    return num1;
}

let num1, num2;
num1 = 96;
num2 = 54;
let result = gcd(num1, num2)
console.log("Greatest Common Divisior for these two number " + num1 +" and "+ num2+" is: "+ result)