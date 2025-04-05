function reverseInt(num){
    let reversed = 0;
while(num!=0){
reversed = (reversed * 10) + num%10;
num /=10;
num=Math.floor(num); // this removes the decimal part
}
return reversed;
}


let num =1234;
let c = reverseInt(num);
console.log(c);
