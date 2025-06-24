const pattern = (n) => {
    for (let i = n; i >= 1; i--) {
        let line = ""
        for (let j = 1; j <=(n - i); j++) {
            line += "  "
        }
        for (let j = 1; j <= (2*i-1); j++) {
            line += j + " ";
        }
        console.log(line)
    }

     for (let i = 2; i <= n; i++) {
        let line = ""
        for (let j = 1; j<=(n-1); j++) {
            line += "  "
        }
        for (let j = 1; j <= (2*i-1); j++) {
            line += j+" ";
        }
        console.log(line)
    }
}

pattern(5)