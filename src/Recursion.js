let sum = 0;
function recFunc(k) {
    if(k !== 0) {
        sum = k + recFunc(k - 1);
    }
    return sum;
}
console.log(recFunc(5));