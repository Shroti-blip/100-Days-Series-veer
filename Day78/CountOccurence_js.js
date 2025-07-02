const count =(matrix , target) => {
    let row = matrix.length;
    let col = matrix[0].length;
    let count = 0;
    for(let i=0; i<row; i++){
        for(let j=0; j<col; j++){
            if(matrix[i][j]==target){
                count++;
            }
        }
    }
    return count;
}

let matrix = [
    [1,2,3],[2,3,4],[6,7,8]
];
let target = 6;
 let ans = count(matrix, target);
 console.log(ans);