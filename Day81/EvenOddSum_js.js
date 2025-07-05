let evenSum =0;
let oddSum = 0;
const sum = (arr) =>{
    for( let i=0; i<arr.length; i++){
        if(arr[i]%2 ==0){
            evenSum += arr[i];
        }
        else{
            oddSum += arr[i];
        }
    }
    console.log("Sum of even digits are : "+evenSum);
     console.log("Sum of odd digits are : "+oddSum);
}

let arr = new Array(1,2,3,4,5,6,7,8 , 33);
sum(arr)