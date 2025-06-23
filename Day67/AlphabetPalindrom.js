const pattern = (n) => {
    for(let i=1; i<=n; i++){
        let ch = 65
        let line = ""
        for(let j=1; j<=(n-i); j++){
            line += " ";
        }
        for(let j=1; j<=(2*i-1); j++){
            line += String.fromCharCode(ch++);
        }
        console.log(line);
    }
}

pattern(5);