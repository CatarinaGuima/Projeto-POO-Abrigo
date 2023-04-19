public abstract class Abstrata {
	//ATRIBUTOS
	private String nome;
	private String raça;
	protected static boolean vacinado;
	protected static boolean castrado;
	protected int idade, animais;
	boolean cadastro; 
	private String sexo, tipoAnimal; 
	
	//CONSTRUTOR
	/**
	 * @param vacinado2
	 * @param castrado2
	 */
	public Abstrata(boolean vacinado, boolean castrado2) {
		Abstrata.vacinado = vacinado;
		this.cadastro = castrado2;
	}
	
	//MÉTODOS ABSTRATOS
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	//MÉTODOS GETTERS E SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//RAÇA
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public String getRaça() {
		return raça;
	}
	
	//VACINADO
	public void setVacinado(boolean vacinado) {
		Abstrata.vacinado = vacinado;
	}
	
	public boolean getVacinado() {
		return vacinado;
	}
	
	//CASTRADO
	public void setCastrado(Boolean castrado) {
		Abstrata.castrado = castrado;
	}
	
	public boolean getCastrado() {
		return castrado;
	}
	
	//IDADE
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	//SEXO
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	//TIPO ANIMAL
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	public String getTipoAnimal() {
		return tipoAnimal; 
	}
}
