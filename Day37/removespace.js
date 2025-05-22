const removespace = (str) => {
    let temp = ""
    for (let i = 0; i < str.length; i++) {
        let ch = str.charAt(i);
        if (ch != ' ') {
            temp += ch;
        }

    }
    console.log(temp)
    // return temp
}

let str = "Muskan Shroti"
removespace(str);
// console.log("result is : " + result);