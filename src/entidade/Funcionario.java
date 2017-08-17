package entidade;

import java.util.List;

public class Funcionario {

	private int id;
	private int matricula;
	private String nome;
	private String email;
	private float salario;
	
	private Equipe equipe;
	private List<Dependente> dependente;
	
	public Funcionario(){
		
	}
	
	@Override
	public String toString(){
		return "Funcionario\nID:" + id + "\nMatricula:" + matricula
				+ "\nNome:" + nome + "\nEmail:" + email
				+ "\nSalario: " + salario;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public int getMatricula(){
		return matricula;
	}
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public float getSalario(){
		return salario;
	}
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public float novoSalario(){
		return salario + (salario * 10 / 100);
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}
	
	
	
	
}
