function count_Digit(num){
    if(num <0){
        num =-num;
    }
    let count = 0;
    while(num !=0){
        count++;
        num /= 10;
        num = Math.floor(num);
    }
    return count;
}


// When counting digits, you need a whole number, not decimals.
// Imagine if someone inputs 123.45 — you don't want to count decimal places, just the digits before the dot.


num =12345678;
let s = count_Digit(num)
console.log(s);
