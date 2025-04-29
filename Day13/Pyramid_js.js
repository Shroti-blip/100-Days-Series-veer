const getPyramidPattern = (n) =>{
    for(let i = 1; i<=n; i++){
    
        //collect spaces
        let  space = '';
    for(let j = 1; j<=n-i; j++){//for spaces
       space += ' ';
    }
    //collect stars
    let stars = '';
    for(let j=1; j<=(2*i-1); j++){//for stars
        stars += '*';
    }
    
    console.log(space + stars);
    }
}
let n = 5;
getPyramidPattern(n)
