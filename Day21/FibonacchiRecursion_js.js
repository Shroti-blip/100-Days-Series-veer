const getFibonacchi =(num) => {
    if(num ==1 || num == 0)
        return 1;
    return getFibonacchi(num-1)+ getFibonacchi(num-2)
}
let num = 6
for(let i=0; i<=num; i++){
    console.log(getFibonacchi(i))
}
