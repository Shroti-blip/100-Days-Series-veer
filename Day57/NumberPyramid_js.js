const numPyramid =(n) => {
for(let i=1; i<=n; i++){
    let line = "";
    for(let j=1; j<=(n-i); j++){
        line += " "
    }
    for(let j=1; j<=i; j++){
        line += j;
    }
    for(let j=i-1; j>=1; j--){
        line += j;
    }
    console.log(line);
}
}

let  n =5;
numPyramid(n);