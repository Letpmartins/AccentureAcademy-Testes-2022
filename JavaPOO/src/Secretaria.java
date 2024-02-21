
public class Secretaria extends Funcionario {

	private String ramal;

	//constructors
	public Secretaria() {
		super();
	}

	public Secretaria(String ramal) {
		super();
		this.ramal = ramal;
	}

	//getters and setters
	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	
}
