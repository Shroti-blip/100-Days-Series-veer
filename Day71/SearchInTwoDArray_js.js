const search = (m) =>{
    let row=m.length;
    let col = m[0].length;
let low =0;
let high = row * col -1;

while(low<=high){
    let mid = low + Math.floor(high-low)/2;
    let middlevalue = m[Math.floor(mid/col)][mid%col];
if(middlevalue == target){
    return true;
}
else if(middlevalue <= target){
    low = mid +1;
}
else{
    high = mid-1;
}
}
return false;
}

let m = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];
let target =50;
 let s = search(m , target);
 if(s){
 console.log("Element / Target exist in this matrix.") 
 }
 else{
    console.log("Element / Target does not exist in this matrix.")
 }
