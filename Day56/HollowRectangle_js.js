const hollowRectangle = (row , col) => {
    for(let i =1; i<=row; i++){
        let line ="";
        for(let j =1; j<=col; j++){
            if(j==1 || i==1 || j==col || i==row){
                line +="*";
            }
            else{
                line +=" ";
            }
        }
        console.log(line)
    }
}

let row =5;
let col = 5; 
hollowRectangle(row , col)