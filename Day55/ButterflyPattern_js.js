const butterfly = (n) => {

    //Upper half.
    for(let i=1; i<=n; i++){
        let line = "";
        for(let j=1; j<=i; j++){
           line += "*";
        }
        for(let k=1; k<=2*(n-i); k++){
            line += " ";
        }
        for(let l=1; l<=i; l++){
         line += "*";
        }
       console.log(line)
    }

    //Lower Half.

    for(let i=n; i>=1; i--){
        let line="";
        for(let j=1; j<=i; j++){
            line += "*";
        }
        for(let k=1; k<=2*(n-i); k++){
            line += " ";
        }
        for(let l =1; l<=i; l++){
            line += "*";
        }
        console.log(line);
    }

}

let n =4;
console.log("Butterfly Pattern.")
butterfly(n)