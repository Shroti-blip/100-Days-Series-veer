function getHcf(a  , b){
    if(b==0){
        return a
    }
    return getHcf(b , a %b);
}
let a = 40 , b=20
let store = getHcf(a , b)
console.log(store)