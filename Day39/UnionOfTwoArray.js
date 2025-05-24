const unionofArray = (arr1, arr2) => {

    let uniArray = new Array(arr1.length + arr2.length);
    let k = 0;
    for (let i = 0; i < arr1.length; i++) {
        uniArray[k++] = arr1[i]
    }

    for (let i = 0; i < arr2.length; i++) {
        let isPresent = false;
        for (let j = 0; j < k; j++) {
            if (uniArray[j] == arr2[i]) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            uniArray[k++] = arr2[i]
        }
    }
    for (let i = 0; i < k; i++) {
        console.log(uniArray[i]);
    }
}


let arr1 = new Array(1, 2, 3, 4, 5, 6);
let arr2 = new Array(3, 4, 5, 6, 7, 8, 9, 0);

unionofArray(arr1, arr2)