const search =(arr , target )=>{
    let start =0
    let end= arr.length-1
    while(start<=end){
        let mid=  Math.floor(start +(end-start)/2);
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<=target){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return -1;
}

let arr= new Array(1,2,3,4,5,6,7,8)
let target = 5
let res = search(arr, target)
console.log(res)