package treinamento;

import java.util.Locale;
import java.util.Scanner;

public class testeLogica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
	
        float maiorAltura = 0;
        float menorAltura = Float.MAX_VALUE;
        double somaAltura = 0;
        int quantidadeMulheres = 0;
        int totalPessoas = 15;
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Informe a altura da pessoa " + i + ":");
            float altura = s.nextFloat();

            System.out.println("Informe o gênero da pessoa " + i + " (m/f):");
            char sexo = s.next().toLowerCase().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'm') {
                somaAltura += altura;
            } else if (sexo == 'f') {
                quantidadeMulheres++;
            } else {
                System.out.println("Gênero inválido. Digite M ou F.");
                i--;
            
            }
            
            
        }

        double mediaAlturaHomens = somaAltura / (totalPessoas - quantidadeMulheres);

        System.out.println("Maior altura: " + maiorAltura + " M");
        System.out.println("Menor altura: " + menorAltura + " M");
        System.out.println("Média da altura dos homens: " + mediaAlturaHomens + " M");
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);

        s.close();
     
	
	}

}
