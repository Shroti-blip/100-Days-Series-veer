const floydTrain =(n) => {
    let num =1;
    for(let i=1; i<=n; i++){
        let line = "";
        for(let j=1; j<=i; j++){
            line += num + "_";
            num++;
        }
        console.log(line )
    }
}

floydTrain(5)