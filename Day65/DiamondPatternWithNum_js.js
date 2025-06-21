const diamondPattern = (n) => {
    for(let i=1; i<=n; i++){
        let line = "";
        for(let j=1; j<=(n-i); j++){
            line += " ";
        }
        for(let j=1; j<=(2*i-1); j++){
            line += i;
        }
        console.log(line);
    }

     for(let i=n-1; i>=1; i--){
        let line = "";
        for(let j=1; j<=(n-i); j++){
            line += " ";
        }
        for(let j=1; j<=(2*i-1); j++){
            line += i;
        }
        console.log(line);
    }
}

diamondPattern(5)