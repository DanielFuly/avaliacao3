package entidade;

import java.time.LocalDate;

public class Projeto {
	private int codigo;
	private LocalDate dataInicioProjeto;
	private LocalDate dataEntrega;
	
	private Equipe equipe;
	
	public Projeto(){
		
	}
	
	@Override
	public String toString(){
		return "\nProjeto\nCodigo:" + codigo +
				"\nData de Inicio:" + dataInicioProjeto
				+"\nData de Entrega:" + dataEntrega;
	}
	
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	public LocalDate getDataInicioProjeto(){
		return dataInicioProjeto;
	}
	public void setDataInicioProjeto(LocalDate dataInicioProjeto){
		this.dataInicioProjeto = dataInicioProjeto;
	}
	
	public LocalDate getDataEntrega(){
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega){
		this.dataEntrega = dataEntrega;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	
}
