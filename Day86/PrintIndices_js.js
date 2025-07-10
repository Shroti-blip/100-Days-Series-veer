const indices = (arr) =>{
    let isEven =0
        let isOdd =0
    for(let i=0; i<=arr.length-1; i++){
        
        if(arr[i]%2 ==0){
            isEven++
        }
        else{
            isOdd++
        }
    }
    console.log("Even indices are : "+isEven )
    console.log("Odd indices are : "+isOdd )
}

let arr= new Array(1,2,3,4,5,6,7)
indices(arr)