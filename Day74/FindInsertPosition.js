 function find(arr , digit){
    let low = 0;
    let high=arr.length-1;
    let mid = low + (high-low)/2;

    if(digit>=high){
        return high;
    }
    while(low<=high){
        if(digit = arr[mid]){
            return mid;
        }
        if(digit<=arr[mid]){
            low = mid+1;
        }
        else{
            high =mid-1;
        }
    }
    return low;
 }

 let arr = new Array(1,2,3,4,5,6,7,44);
 let digit = 33;
let a = find(arr, digit);
console.log(a)