import java.util.Scanner;

public class Pratica12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero1 = scan.nextInt();
		System.out.println("Digite mais um n�mero: ");
		numero2 = scan.nextInt();
		
		System.out.println("Soma: " + (numero1+numero2));
		System.out.println("Subtra��o: " + (numero1-numero2));
		System.out.println("Produto: " + (numero1*numero2));
		System.out.println("Divis�o: " + (numero1/numero2));
		
		scan.close();

	}

}
