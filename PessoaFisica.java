package br.com.pessoa.fisica;

public class PessoaFisica {

	private String nome;
	private String dataDeNascimento;
	private long telefone;
	private String email;
	private long cpf;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nNome: " + nome + "\nCpf: " + cpf + "\nData de Nascimento: " + dataDeNascimento + "\nEmail: " + email
				+ "\nTelefone: " + telefone;
	}
}
