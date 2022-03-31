package analiseEstatistica;

public class Aluno {
	private String  nome;
	private Integer idade;
	private String  genero;
	private String  curso;
	private Integer pediodo;
	private Integer anoEntrada;
	private Integer semestreEntrada;
	private Double	maiorNota;
	private Double 	menorNota;
	private String  profissao;
	private Double  salario;
	
	public Aluno() {
	}

	public Aluno(String nome, Integer idade, String genero, String curso, Integer pediodo, Integer anoEntrada,
			Integer semestreEntrada, Double maiorNota, Double menorNota, String profissao, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.curso = curso;
		this.pediodo = pediodo;
		this.anoEntrada = anoEntrada;
		this.semestreEntrada = semestreEntrada;
		this.maiorNota = maiorNota;
		this.menorNota = menorNota;
		this.profissao = profissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getPediodo() {
		return pediodo;
	}

	public void setPediodo(Integer pediodo) {
		this.pediodo = pediodo;
	}

	public Integer getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(Integer anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public Integer getSemestreEntrada() {
		return semestreEntrada;
	}

	public void setSemestreEntrada(Integer semestreEntrada) {
		this.semestreEntrada = semestreEntrada;
	}

	public Double getMaiorNota() {
		return maiorNota;
	}

	public void setMaiorNota(Double maiorNota) {
		this.maiorNota = maiorNota;
	}

	public Double getMenorNota() {
		return menorNota;
	}

	public void setMenorNota(Double menorNota) {
		this.menorNota = menorNota;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return nome + ", " + idade + ", " + genero +  ", " + curso + ", " + pediodo	+ ", " + anoEntrada + ", " 
				    + semestreEntrada + ", " + maiorNota + ", " + menorNota + ", " + profissao + ", " + String.format("%.2f", salario);
	}
	
	
	
}
