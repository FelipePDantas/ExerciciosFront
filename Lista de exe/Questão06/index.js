function calcularMontante(capitalInicial, taxaJuros, tempoMeses) {
    var taxaDecimal = taxaJuros / 100;
    var montante = capitalInicial * Math.pow((1 + taxaDecimal), tempoMeses);
    montante = parseFloat(montante.toFixed(2));
    
    return montante;
}

var resultado = calcularMontante(1400, 1.5, 24);
console.log(resultado);