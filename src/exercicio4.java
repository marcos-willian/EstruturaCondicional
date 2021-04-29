import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] classificacao = {"Magreza", "Normal", "Sobrepeso", "Obesidade (grau I)", "Obesidade Grave (grau II)"};
		System.out.println("Por favor, insira o seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Por favor, insira a sua idade:");
		int idade = entrada.nextInt();
		System.out.println("Por favor, insira a sua altura em metros:");
		double altura = entrada.nextDouble();
		System.out.println("Por favor, insira o seu peso em kg:");
		double peso = entrada.nextDouble();
		double imc = (peso/(altura*altura));
		int numeroClassificacao;
		if(imc<18.5) {
			numeroClassificacao = 0;
		}else if(imc<=24.9) {
			numeroClassificacao = 1;
		}else if(imc<=29.9) {
			numeroClassificacao = 2;
		}else if(imc<=39.9) {
			numeroClassificacao = 3;
		}else {
			numeroClassificacao = 4;
		}
		System.out.printf("%s, você tem %d anos de idade e o seu IMC é de %.1f. A sua classificação é: %s", 
				nome, 
				idade, 
				imc, 
				classificacao[numeroClassificacao]);
		entrada.close();
	}
}
