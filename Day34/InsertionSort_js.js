const insertionSort = (arr) =>{
    for(let i=0; i<arr.length; i++){
        for(let j= i+1; j>0; j--){
            if(arr[j-1]>arr[j]){
                //swap
                let temp = arr[j]
                  arr[j] = arr[j-1]
                arr[j-1]= temp;
            }
        }
    }
    console.log(arr.toString(arr))
}


console.log("hola");
let arr = new Array(1,4,2,3,5);
insertionSort(arr)