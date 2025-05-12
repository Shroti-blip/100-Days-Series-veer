const mergeTwoArray = (arr1 , arr2) => {

    let  size1 = arr1.length;
    let size2 = arr2.length;

    let i =0 , j=0 , k= 0;

  let   mergedArray = new Array(size1 + size2);

    while(i<size1 && j <size2){
        if(arr1[i] === arr2[j]){
            mergedArray[k++] = arr1[i++];
        }
        else{
            mergedArray[k++] = arr2[j++]
        }
    }
//// Store Remaining elements of arr1

while(i<size1){
    mergedArray[k++] = arr1[i++]
}
while(j<size2){
mergedArray[k++] = arr2[j++]
}
return mergedArray;

}

arr1 = new Array(1,2,4,6,7)
arr2 = new Array(2,4,6,71,2);

let  mergedArray = mergeTwoArray(arr1 , arr2)

for(let i=0; i<mergedArray.length; i++){
    console.log(mergedArray[i])
}