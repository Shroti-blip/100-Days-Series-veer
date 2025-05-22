const secondlargest =(arr) =>{
let l = arr.length-1;
console.log(arr[l-1])

}

const sort =(arr) =>{
for(let i=0; i<arr.length; i++){
    for(let j=0 ; j<arr.length-1; j++){
        if(arr[j] > arr[j+1]){
            //swap
            let temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp
        }
    }
}
console.log(arr.toString(arr))
}

// let arr = new Array(2,4,5,6,7,8);

let arr = new Array (3,55,44,3,4,77,1,2,23,98,90,0);
console.log("Sorted Array is : ")
sort(arr)
console.log("===============================================")
console.log("Second largest number is : ")
secondlargest(arr);