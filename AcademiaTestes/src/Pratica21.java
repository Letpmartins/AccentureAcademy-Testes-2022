import java.util.Scanner;

public class Pratica21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();
		
		if(numero == 6){
			System.out.println("O valor lido � o 6.");
		} else {
			System.out.println("O valor lido n�o � o 6.");
		}
		
		scan.close();
		
	}
}
