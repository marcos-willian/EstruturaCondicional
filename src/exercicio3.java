import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, insira o preço da gasolina:");
		double gasolina = entrada.nextDouble();
		System.out.println("Por favor, insira o preço da etanol:");
		double etanol = entrada.nextDouble();
		System.out.printf("\n\nO preço da gasolina informado foi: %.2f\n",gasolina);
		System.out.printf("O preço do etanol informado foi : %.2f\n", etanol);
		double difPercentual = (gasolina - etanol)/gasolina*100;
		System.out.printf("A diferença percentual, ou seja, o etanol é mais barato %.1f%% do que a gasolina é: \n",difPercentual);
		if((etanol/gasolina) <=0.7) {
			System.out.println("O abastecimento com etanol é viável.");
		}else {
			System.out.println("O abastecimento com etanol não é viável.");
		}
		entrada.close();
	}

}
