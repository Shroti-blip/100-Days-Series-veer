let arr1 = new Array(2,3,4,5,6,7);
let arr2 = new Array(4,5,6,7,8,9);

for(let i = 0; i<arr1.length; i++){
    for(let j=0; j<arr2.length; j++){
        if(arr1[i] ==arr2[j]){
            console.log(arr1[i] +" ");
            break;
        }
    }
}