const matrixMulti = (m1 ,m2) => {
 
    let result =[]
    for(let i=0; i<m1.length; i++){
        let row=[]
        for(let j=0; j<m1[0].length; j++){
            let sum = 0
            for(let k=0; k<m1[0].length; k++){
                sum += m1[i][j] * m2[i][j]
            }
            row.push(sum)
        }
        result.push(row)
    }
    return result
}

m1 = [
    [1,2],
    [3,4]
]

m2 = [
     [1,2],
    [3,4]
]

let ans = matrixMulti(m1 , m2)
console.log(ans);