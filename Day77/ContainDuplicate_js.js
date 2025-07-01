const duplicate = (arr) => {
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr[i].length; j++){
            if(arr[j] > arr[j+1]){
                //swap
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(let i=0; i<arr.length; i++){
        if(arr[i] ==arr[i+1]){
            return true;
        }
    }
    return false;
}

let arr = new Array(1,22,22,3,4,5,5);
 let ans = duplicate(arr);
console.log(ans);