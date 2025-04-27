
function getGCD(num1, num2){
    while(num2 != 0){
        let remainder = num1% num2;
        num1 = num2;
        num2 = remainder;
    }
    return num1;
}

function getlcm(num1 , num2){
    let c = getGCD(num1, num2);
    return  num1*num2/c;
}

num1=12;
num2=15;

let lcm = getlcm(num1, num2);
console.log(lcm);