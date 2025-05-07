let str = "hello world";

const getVowel = (str) => {
    let count =0;
    for(let i =0; i<str.length; i++){
        if(str.charAt(i) =='a' ||str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i)=='u' ){
            count++;
        }
    }
    return count;
}

const getConso =(str) => {
    let count =0; 
    for(let i=0; i<str.length; i++){
        if(!(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')){
            count++;
        }
    }
    return count;
}

let store = getVowel(str)
let store2 = getConso(str)
console.log("number of vowels are: " + store)
console.log("number of consonants are : " + store2)