function sumofNatural(num) {
    if (num == 1) {
        return 1;
    }
    let sum = 0
    for (let i = 0; i <= num; i++) {
        sum += i;
    }
    return sum;
}

//Recursion Function

const  sumofNatural2 =(num) => {
    sum =0;
    if(num ==1)
        return 1;
    return sum + sumofNatural2(num--)
}

let num = 10;
let store = sumofNatural(num)
console.log(store)

let store2 = sumofNatural(num)
console.log(store2)