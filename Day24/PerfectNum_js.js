let perfectNum = (num) => {
    let count =0;
    if (num == 0) {
        return 0;
    }

    for (let i = 1; i < num; i++) {
        if (num % i == 0) {
            count = count + i;
        }
    }
    if (count == num) {
        return 1;
    }
    else{
        return 0;
    }
}

let num = 28;
let result = perfectNum(num)
console.log(result)//1 --->> perfect number &&& 0 ---->>> not a perfect number.