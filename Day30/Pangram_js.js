const isPangram= (sentence) =>{

    sentence = sentence.toLowerCase();

    let letter = new Set();

    for(let char of sentence){
        if(char>='a' && char<='z'){
            letter.add(char);
        }
    }
    return letter.size == 26;
}

console.log(isPangram("The quick brown fox jumps over the lazy dog")); // true
console.log(isPangram("Hello world")); // false
