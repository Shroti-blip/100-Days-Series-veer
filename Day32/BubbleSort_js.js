const bubbleSort =(arr) => { 
for(let i=0; i<arr.length; i++){
    for(let j=0; j<arr.length-1; j++){
        if(arr[j] > arr[j+1]){
            let temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
        }
    }
}
console.log(arr.toString())
console.log(arr.join("-"))
// console.log(Array.toString(arr))

// In js Array is Constructor class and i am trying to call  'toString' as a static method of Array, but it belongs to 
// instance of Array



}


 let arr = new Array(3,1,2,5,4)
 console.log("Array before sorting")
 console.log(arr)
 console.log("Array after Sorting")
//  bubbleSort(arr)
 console.log(bubbleSort(arr))