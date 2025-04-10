function armStrongNum(num) {
    let c = power(num);
    let sum = 0;
    let temp = num;

    while (temp != 0) {
        let digit = temp % 10;
        sum += Math.pow(digit, c);
        temp = Math.floor(temp / 10);
    }

    return sum;
}

function power(num) {
    let count = 0;
    while (num != 0) {
        num = Math.floor(num / 10);
        count++;
    }
    return count;
}

let num = 153;
let result = armStrongNum(num);

if (result === num) {
    console.log("This is an Armstrong number.");
} else {
    console.log("Not an Armstrong number.");
}
