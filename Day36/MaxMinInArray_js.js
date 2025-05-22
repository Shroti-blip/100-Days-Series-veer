let arr = new Array( 12,24,35,80,0,44);

    let max = arr[0];
    let min = arr[0];
for(let i=0; i<arr.length; i++){

    if(arr[i] >max){
        max = arr[i];
    }
    if(arr[i] <min){
        min =arr[i];
    }
}

console.log("Minimam number is : " + min);
console.log("Maximum number is : " + max);

