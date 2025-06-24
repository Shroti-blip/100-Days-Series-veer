function missingNum(arr){
    let n = arr.length+1;
    let sum = n *(n+1)/2;
    console.log("Total Number sum is : " + sum)
    //arrsum
    let sum2= 0;
    for(let i=0; i<arr.length; i++){
         sum2 += arr[i];
    }
    console.log("Array sum is : "+sum2);

    return sum - sum2;

}

let arr = new Array(1,2,3,4,5,6,8,9);
 let result = missingNum(arr);
 console.log("Missing Number is : "+result)