const getPower= (base , exp) => {
     let res =1;
    while(exp != 0){
        if(exp == 0){
            return 1;
        }
       
        res *= base;
        exp--;
    }
    return res;
}

//Recursive function

function getPowerRec(base , exp){
if(exp == 0){
    return 1;
}
return base * getPowerRec(base , --exp);
}
//Use --exp because you want to pass the decremented value to the next recursive call. 
let num =3 ;
let power = 3;
let store = getPower(num , power);
let store2 = getPowerRec(num , power);
console.log(" Answer is : " + store)
console.log("Answer is : " + store2);
