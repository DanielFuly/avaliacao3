package entidade;

public class Dependente {
	
	private String nome;
	private String filiacao;
	
	
	private Funcionario funcionario;
	
	
	public Dependente(){
		
	}
	
	@Override
	public String toString(){
		return "\nDependente\nNome:" + nome + "\nFiliacao:" + filiacao;
	}
	
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getFiliacao(){
		return filiacao;
	}
	public void setFiliacao(String filiacao){
		this.filiacao = filiacao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
	
}
