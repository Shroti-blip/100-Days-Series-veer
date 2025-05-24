const matrixmerge = (m1 ,m2) => {

    if(m1.length != m2.length && m1[0].length !=m2[0].length){
        console.log("matrix size is not equal.");
        return;
    }

    let result =[]
    for(let i=0; i<m1.length; i++){
        let row =[]
        for(let j=0; j<m1[0].length; j++){
            // result[i][j] = m1[i][j]+ m2[i][j]
            row.push(m1[i][j]+m2[i][j])
            // result.push([i][j])
        }
        result.push(row)
    }

    for(let i=0; i<m1.length; i++){
        for(let j=0; j<m1[0].length; j++){
            console.log(result[i][j]+",")
        }
        console.log("")
    }

}

m1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

m2 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

matrixmerge(m1 , m2)