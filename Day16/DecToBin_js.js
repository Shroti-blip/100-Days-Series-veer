

const dec_to_bin = (num) => {
    let binary = 0;
    let place = 1;
    while (num != 0) {
        let remainder = num % 2;
        binary += remainder * place;
        place *= 10;
        num = num / 2;
        num = Math.floor(num)
    }
    return binary;
}

let num = 4
let result = dec_to_bin(num)
console.log("Answer is : " + result)