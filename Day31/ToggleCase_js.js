
function isLowerCase(char) {
    return char === char.toLowerCase() && char !== char.toUpperCase();
}
function isUpperCase(char) {
    return char === char.toUpperCase() && char !== char.toLowerCase();
}
//A

const toggleCase = (str) => {
    result = "";

    for(let i =0; i<str.length; i++){
        let ch = str.charAt(i);

        if(isUpperCase(ch)){
            result += ch.toLowerCase();
        }
        else if(isLowerCase(ch)){
            result += ch.toUpperCase();
        }

        else{
            result += ch;
        }
    }
    return result;
}

let str = "HolA";
let store = toggleCase(str)
console.log(store)