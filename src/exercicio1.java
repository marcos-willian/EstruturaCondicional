import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anoAtual, anoNascimento;
		System.out.println("Por favor, insira o ano atual:");
		anoAtual = entrada.nextInt();
		System.out.println("Por favor, insira o ano do seu nascimento:");
		anoNascimento = entrada.nextInt();
		int idade = anoAtual - anoNascimento;
		if(idade<13) {
			System.out.println("Voc� � uma crian�a!");
		}else if(idade<20) {
			System.out.println("Voc� � um adolescente!!");
		}else if(idade<61) {
			System.out.println("Voc� � um adulto!!");
		}else {
			System.out.println("Voc� � um idoso!!");
		}
		entrada.close();
	}
	

}
