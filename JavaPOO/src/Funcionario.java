
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private double pisoSalarial;
	
	
	//constructors
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, double salario, double pisoSalarial) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.pisoSalarial = pisoSalarial;
	}

	
	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getPisoSalarial() {
		return pisoSalarial;
	}

	public void setPisoSalarial(double pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}

	//New Method
	public double ajustarPiso(double taxa) {
		return this.pisoSalarial = this.pisoSalarial * taxa;
		
	}
	
	
}
