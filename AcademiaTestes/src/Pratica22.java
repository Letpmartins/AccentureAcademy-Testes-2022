import java.util.Scanner;

public class Pratica22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		if(numero >= 1 && numero <= 10){
			System.out.println("O valor lido está entre 1 e 10.");
		} else {
			System.out.println("O valor lido não está entre 1 e 10.");
		}
		
		scan.close();

	}

}
