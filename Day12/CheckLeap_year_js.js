function leapyear(year){
    if((year%4 == 0 && year%100 != 0) || year %400 == 0){
        return true;
    }
    else{
        return false;
    }
}

let store = leapyear(2020)
if(store==true){
    console.log("Given year is a leap year")
}
else{
    console.log("Given year is not a leap year.")
}