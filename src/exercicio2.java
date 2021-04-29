import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, insira 3 numeros:");
		double[] numero = new double[3];
		for (int i = 0; i<3; i++) {
			numero[i] = entrada.nextDouble();
		}
		double max = 0;
		for (double pesquisa : numero) {
			if(pesquisa > max) {
				max = pesquisa;
			}
		}
		System.out.println("O numero maior é: " + max);
		entrada.close();
	}

}
