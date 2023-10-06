let pares = [];
let impares = [];

for(let i = 0; i < 11; i++){
    if(i%2 == 0){
        pares.push(i)
    } else {
        impares.push(i)
    }
}


console.log(pares.length);
console.log(impares.length);