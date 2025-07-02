let words= new Array("zero","one","two","three","four","five","six","seven","eight","nine");
// let words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];


const convert = (num) =>{
    if(num ==0){
        return "";
    }
    let result = convert(num/10);
    result += words[num%10];
    return result;
}

let num = 3;
let ans = convert(num);
console.log(ans);