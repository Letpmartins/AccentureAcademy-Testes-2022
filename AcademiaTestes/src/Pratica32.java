import java.util.Scanner;

public class Pratica32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menos21, mais50, idade;
		menos21 = mais50 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Digite uma idade (ou -99 para encerrar): ");
			idade = scan.nextInt();
			
			if(idade < 21 && idade > 0) {
				menos21++;
			} else if(idade >50) {
				mais50++;
			}
			
		} while(idade != -99);
		
		System.out.println(menos21);
		System.out.println(mais50);
		
		scan.close();
		
	}

}
