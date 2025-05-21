

let arr = new Array(3,2,5,4,1);


// let low = 0; 
// let hi = arr.length-1;
const quicksort =(arr , low , hi) =>{

    if(low>=hi){
        return;
    }

    let s = low;
    let e = hi;
    let m =Math.floor(s +(e-s)/2)
    let pivot = arr[m]

    while(s<=e){

    while(arr[s] < pivot){
        s++
    }
    while(arr[e] > pivot){
        e--;
    }
    if(s<=e){
        let temp = arr[s]
        arr[s] = arr[e]
        arr[e] = temp;
        s++
        e--
    }   
 }


    quicksort(arr , low , e)
    quicksort(arr, hi, s)
}
quicksort(arr , 0 , arr.length-1)
console.log(arr.toString())
