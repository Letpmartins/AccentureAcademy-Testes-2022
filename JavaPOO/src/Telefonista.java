
public class Telefonista extends Funcionario {

	private int codigo;

	//constructors
	public Telefonista() {
		super();
	}

	public Telefonista(int codigo) {
		super();
		this.codigo = codigo;
	}

	
	//getters and setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
