package entidade;

import java.util.List;

public class Equipe extends Funcionario {
	private String nome;
	private String descricao;
	
	private Departamento departamento;
	private List<Funcionario> funcionario;
	private List<Projeto> projeto;
	
	public Equipe() {
		
	}
	
	@Override
	public String toString(){
		return "\nEquipe\nNome:" + nome + 
				"\nDescricao:" + descricao;
				
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public List<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(List<Projeto> projeto) {
		this.projeto = projeto;
	}
	
	public void alocaFuncionario(Funcionario f, Projeto p){
		
	}
	
	

}
