import java.util.Scanner;

public class Pratica21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		if(numero == 6){
			System.out.println("O valor lido é o 6.");
		} else {
			System.out.println("O valor lido não é o 6.");
		}
		
		scan.close();
		
	}
}
