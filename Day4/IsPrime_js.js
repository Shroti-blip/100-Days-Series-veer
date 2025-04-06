function isPrime(num){
    if(num ==1 || num ==2){
        return "base case";
    }
    for(let i =2; i<=num/2; i++){
        if(num%i == 0){
            return "number is not a prime number";
        }
    }
    return "number is  prime number";
}
let num = 71
console.log(isPrime(num))
