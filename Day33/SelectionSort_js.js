const selectionSort = (arr) =>{

    for(let i =0 ; i<arr.length; i++){
        let miniidx = i;
        for(let j =0; j<arr.length;j++){
            if(arr[j]<arr[miniidx]){
                 miniidx=j;
            }
            let temp = arr[j];
                arr[j] = arr[miniidx]
                arr[miniidx] = temp;
        }
    }
console.log(arr.toString())
}

let arr = new Array(3,2,5,1,4)

console.log("Original Array : " )
console.log(arr)
console.log("Sorted Array: ")
selectionSort(arr)


