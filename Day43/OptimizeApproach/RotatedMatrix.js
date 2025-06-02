let m = [
    [1,2,3], 
    [4,5,6], 
    [7,8,9]
]

const transpose = (m) => {
for(let i=0; i<m.length; i++){
    for(let j=i+1; j<m[0].length; j++){
        let temp = m[i][j]
        m[i][j] = m[j][i]
        m[j][i] = temp
    }
}
}

const rotated = (m) => {
    for(let i=0; i<m.length; i++){
        let start =0; let end=m.length-1;
        while(start < end){
            let temp = m[i][start]
            m[i][start] = m[i][end]
            m[i][end] = temp
            start++
            end--
        }
    }
}


const printMatrix = (m) => {
    for(let i=0; i<m.length; i++){
        let row = ""
        for(let j=0; j<m[0].length; j++){
             row += m[i][j] + " ";
        }
        console.log(row)
    }
}

console.log("Print Original Matrix")
printMatrix(m)


transpose(m)
rotated(m)
console.log("Print Rotated matrix: ")

printMatrix(m)