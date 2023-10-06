let maior = 0;
let menor = 0;

for (let i = 0; i < 11; i++) {
    if (i < menor) {
        menor = i;
    } else if (i > maior) {
        maior = i;
    }
}

console.log(maior);
console.log(menor);