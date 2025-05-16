const countWord = (str) =>{
    let words;

    if(str.trim() ==""){
        console.log("There is no words")
    }
    else{
         words = str.trim().split(/\s+/);

    }
    return words;
}

let str = "Muskan Shroti just an ordinary girl  , kinda cringy + clingy."
let result = countWord(str)
console.log("Total word in this sentence is : "+result )