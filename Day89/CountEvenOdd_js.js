const count =(n) =>{
    let even =0;
    let odd =0;
    for(let i=1; i<=n; i++){
        if(i%2 ==0){
            even++
        }
        else{
            odd++;
        }
    }
    console.log("Even nums are : "+even)
    console.log("Odd nums are : "+odd)

}

count(23)