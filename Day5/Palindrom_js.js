function IsPalindrom(num){
    let reversed = 0;
    while(num != 0){
        reversed = (reversed * 10)+num%10;
        num = Math.floor(num / 10);
        //     Math.floor(num /= 10);  But you’re not assigning the result of Math.floor(...) back to num. So num will still hold the float value 123.4.
    }
    return reversed;
}

let num = 1221;
let c = IsPalindrom(num)
if(c == num){
    console.log("This is a Palindrom")
}
else{
    console.log("This is not a Palindrom")
}