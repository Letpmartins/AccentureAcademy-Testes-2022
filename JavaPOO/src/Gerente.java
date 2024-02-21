
public class Gerente extends Funcionario {
	
	private String login;
	private String senha;
		
	//constructors
	public Gerente() {
		super();
	}

	public Gerente(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	
	//getters and setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
