let str = "Hello World";

const reversestr=(str) =>  {
    reversed = '';
    for(let i=str.length-1; i>=0;i--){//in js .length is a property not a function.
        reversed +=str.charAt(i);
    }
   console.log(reversed);
}

reversestr(str)