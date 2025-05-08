let size;

const getRemoveDuplicate = (arr) =>{
    size = arr.length;
    temp = new Array();
    let index =0;
    let j;
    for(let i=0; i<size; i++){
        for(j =0; j<index; j++){
            if(arr[i] == temp[j]){//Because temp[] holds the already added unique elements, not arr[]
                break;
            }
        }
        if(j==index){
            temp[index++] =arr[i];

            //short hand of this line.
            /*
            
            temp[index] = arr[i];
            index = index + 1;

            stores arr[i] at the current position index in temp[],

            then increments index for the next unique element.


            */ 
        }
    }
    size = index ;
    return temp;
}

arr = new Array(1 , 2 , 3 ,4 , 4, 4, 5, 5, 6 ,7 )

carr=getRemoveDuplicate(arr);
for(let i=0; i<size;  i++){
    console.log(" " + carr[i]);

}