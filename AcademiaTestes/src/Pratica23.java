import java.util.Scanner;

public class Pratica23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.print("Digite um número: ");
		numero1 = scan.nextInt();
		System.out.print("Digite um número: ");
		numero2 = scan.nextInt();
		System.out.print("Digite um número: ");
		numero3 = scan.nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior valor é: " + numero1);
		} else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O maior valor é: " + numero2);
		} else if(numero3 >= numero1 && numero3 >= numero2) {
			System.out.println("O maior valor é: " + numero3);
		}
		
		scan.close();
	}

}
