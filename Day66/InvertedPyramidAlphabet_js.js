const pattern =(r) =>{
    for(let i=r; i>=1; i--){
        let ch = 65;
        let line = ""
        for(let j=1; j<=i; j++){
              // Convert ASCII value to character and add a space
            line += String.fromCharCode(ch++) + " ";
        }
        console.log(line)
    }
}

pattern(5)