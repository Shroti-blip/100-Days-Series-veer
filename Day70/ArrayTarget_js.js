const arrayTarget =(a , t) =>{
    for(let i=0; i<a.length; i++){
        for(let j=i+1; j<=a.length; j++){
            if(a[i] + a[j] == t){
                console.log("Indices : " + i +"," + j);
                // return;
            }
        }
    }
}
let a = new Array(1,2,3,4,5,6,7,8,9)
let t = 9;
arrayTarget(a ,t)