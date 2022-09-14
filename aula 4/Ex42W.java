import java.util.Scanner;

public class Ex42W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i;
		double dividendo, divisor, divisao, soma;
		
		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
		n = ler.nextInt();
		
		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor de N deve ser positivo e menor que 50.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
			n = ler.nextInt();
		}
		
		dividendo = 1;
		divisor = 2;
		i = 1;
		soma = 0;
		
		while (i <= n) {
		    divisao = dividendo / divisor;
		    soma = soma + divisao;
    	    System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
    	    dividendo++;
    	    divisor++;
    	    i++;
		}
		System.out.printf("A soma é: %.2f", soma);
        ler.close();
	}
}