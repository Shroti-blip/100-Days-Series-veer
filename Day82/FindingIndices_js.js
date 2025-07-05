const find =(arr, target , index) =>{
let len = arr.length;
if(index == len){
    return ;
}
if(arr[index] == target){
    console.log("Indices are : "+ index)
}
return find(arr, target, ++index)
}

let arr = new Array(1,2,3,4,55,5,55,5,5,55, 6, 7);
let target = 55;
let index =0;
find(arr, target , index)