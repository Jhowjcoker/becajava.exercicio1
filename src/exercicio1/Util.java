package exercicio1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Util {
		private Scanner leitor = new Scanner(System.in);
		
		public void Imprimir(String texto) {		
			System.out.println(texto);		
		}
		
		public double Soma(double valor1, double valor2) {
			return valor1 + valor2;
		}
		
		public double Subtrai(double valor1, double valor2) {
			return  valor1 - valor2;
		}
		
		public double LerDouble(String texto) {
			
			Imprimir(texto);
			double result = leitor.nextDouble();
			//leitor.close();
			return result;
		}
		
		public void log(String texto) {
			LocalDateTime agora = LocalDateTime.now();
			Imprimir("[" + agora + "] - " + texto);
		}
		
		

}


