package exercicio1;

public class Main {
	
	public static void main(String[] args) {
		Util u = new Util();
		
		//u.Imprimir("Bem vindos a aula!");
		
		
		double valor1 = u.LerDouble("Digite o primeiro numero: ");
		double valor2 = u.LerDouble("Digite o segundo numero: ");
		
		//SOMANDO VALORES
		double resultado = u.Soma(valor1, valor2);
		//u.Imprimir("O resultado da soma é: " + resultado);
		u.log("O resultado da soma é: " + resultado);
		
		
		//SUBTRAINDO VALORES
		//resultado = u.Subtrai(4, 3);
		//u.Imprimir("O resultado da subtração é: " + resultado);
		
	}

}
