const checkboardPattern =(n) => {
for(let i=1; i<=n; i++){
    let s = "";
    for(let j=1; j<=n; j++){
        if((i+j) % 2 == 0 ){
            s += "* ";
        }
        else{
            s += "  ";
        }
    }
    console.log(s)
}
}

checkboardPattern(5)