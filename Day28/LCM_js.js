const getgcd = (a , b) => {
     if(b==0)
        return a;
    return getgcd(b , a % b)
}

const getLcm = (a , b) => {
   
    return (a*b)/getgcd(b , a%b);
}

let a = 20;
let b = 40;
let lcm = getLcm(a , b)
console.log(lcm)