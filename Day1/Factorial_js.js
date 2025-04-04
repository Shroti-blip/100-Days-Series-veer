function factorial(n){
if(n==0||n==1){
    return 1;
}
if(n<0){
    return -1;
}
else{
    let fact = 1;
    for(let i =1;i<=n;i++){
        fact = fact * i;
    }
    return fact;
}
}

let n = 5;
n =factorial(n)
if(n == -1){
    console.log("number is less then zero")
}
else{
    console.log("factorial of number is : " + n)
}