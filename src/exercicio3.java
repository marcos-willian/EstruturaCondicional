import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, insira o pre�o da gasolina:");
		double gasolina = entrada.nextDouble();
		System.out.println("Por favor, insira o pre�o da etanol:");
		double etanol = entrada.nextDouble();
		System.out.printf("\n\nO pre�o da gasolina informado foi: %.2f\n",gasolina);
		System.out.printf("O pre�o do etanol informado foi : %.2f\n", etanol);
		double difPercentual = (gasolina - etanol)/gasolina*100;
		System.out.printf("A diferen�a percentual, ou seja, o etanol � mais barato %.1f%% do que a gasolina �: \n",difPercentual);
		if((etanol/gasolina) <=0.7) {
			System.out.println("O abastecimento com etanol � vi�vel.");
		}else {
			System.out.println("O abastecimento com etanol n�o � vi�vel.");
		}
		entrada.close();
	}

}
