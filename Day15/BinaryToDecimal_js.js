const BintoDec = (num) => {
    let decimal = 0;
    let base = 1;
    while (num != 0) {
        let remainder = num % 10;
        decimal += remainder * base;
        base *= 2;
        num /= 10;
        num = Math.floor(num);//remeber this.
    }
    return decimal;
}

num = 1020340;
let store = BintoDec(num);
console.log("Decimal form of this number is : " + store)