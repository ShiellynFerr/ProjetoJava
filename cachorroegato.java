package ProjetoAdote;

public class cachorroegato {

	int id = 0;
	String tipo;//cachorro ou gato
	String nome;
	String castrado;
	String vacinado;
	String sexo;
	String Casa;
	String Apto;
	String cor;
	String raca;
	String porte;
//DECLARAÇÃO DE PARAMETRÔS
	public cachorroegato(String tipo, String nome,String sexo,String castrado, String vacinado, String Casa, String Apto, String cor, String raca, String porte) {
		this.tipo=tipo;
		this.nome = nome;
		this.castrado = castrado;
		this.sexo = sexo;
		this.vacinado=vacinado;
		this.Casa = Casa;
		this.Apto = Apto;
		this.cor = cor;
		this.raca = raca;
		this.porte = porte;
		
	}
	//METODOS GET E SET E TOSTRING
	
	
	public String getTipo() {
		return tipo;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCastrado() {
		return castrado;
	}
	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}
	public String getVacinado() {
		return vacinado;
	}
	public void setVacinado(String vacinado) {
		this.vacinado = vacinado;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCasa() {
		return Casa;
	}
	public void setCasa(String casa) {
		Casa = casa;
	}
	public String getApto() {
		return Apto;
	}
	public void setApto(String apto) {
		Apto = apto;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	//IMPRIMIR INFO
	public String toString() {
		return  this.tipo+ " -> " + this.nome + " -> " + this.sexo + ", "+ this.porte + ", " + this.castrado+ ", "+ this.vacinado +", "+ this.cor + "// Vive bem em casa? "+ this.Casa + " // Em Apartamento? " + this.Apto + "// RAÇA: " + this.raca+" PORTE: "+this.porte;
	}
}
