package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de meses a serem calculados");
		
		Scanner entrada = new Scanner(System.in);
		int meses = entrada.nextInt();
		
		int resultado = meses * 30;
		
		System.out.println("A quantidade de meses calculados é: " + resultado + "dias!");
	}

}
