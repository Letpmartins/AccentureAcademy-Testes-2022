
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario pessoa = new Funcionario("Leticia", "123.456.789-10", 1000.00, 800.00);
		
		pessoa.setNome("Letícia P. Martins");
		pessoa.setCpf("123.456.789-11");
		pessoa.setSalario(5000.00);
		pessoa.ajustarPiso(1.3);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getSalario());
		System.out.println(pessoa.getPisoSalarial());

	}

}
