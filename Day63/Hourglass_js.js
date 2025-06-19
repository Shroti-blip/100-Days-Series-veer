const hourGlassPattern = (n) => {


for(let i=n; i>=1; i--){
        let s ="";
        for(let j=1; j<=n-i; j++){
            s += " ";
        }
        for(let j=1; j<=(2*i-1); j++){
            s += "*";
        }
        console.log(s)
    }


    for(let i=2; i<=n; i++){
        let s ="";
        for(let j=1; j<=n-i; j++){
            s += " ";
        }
        for(let j=1; j<=(2*i-1); j++){
            s += "*";
        }
        console.log(s)
    }
}

hourGlassPattern(5)