import java.util.Scanner;

public class Pratica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		String nome;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Olá "+nome+". Você tem "+idade+" anos.");
		scan.close();
	}

}
