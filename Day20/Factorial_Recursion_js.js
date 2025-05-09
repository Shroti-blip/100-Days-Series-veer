const getFacctorial = (num) => {
    if(num == 0 ||  num == 1){
        return 1
    }
    return num * getFacctorial(num-1)
}

let result = getFacctorial(5)
console.log(result);