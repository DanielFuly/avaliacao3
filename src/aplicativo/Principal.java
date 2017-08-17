package aplicativo;

import java.time.LocalDate;
import java.util.Arrays;


import entidade.*;

public class Principal {
	
	public static void main(String [] args){
	
	Funcionario f = new Funcionario();
	Dependente d = new Dependente();
	Equipe e = new Equipe();
	Projeto p = new Projeto();
	Departamento de = new Departamento();
	
//-----------------Funcionario---------------------
	f.setId(1);
	f.setMatricula(155);
	f.setNome("Flavio");
	f.setEmail("flavinho@gmail.com");
	f.setSalario(1200);
//----------------Dependente------------------------	
	d.setNome("Matheus");
	d.setFiliacao("Mercedez");
//----------------Equipe----------------------------
	e.setNome("Velhinhas do 21");
	e.setDescricao("Buscar as velhinhas");
	
//---------------Projeto----------------------------
	p.setCodigo(555);
	p.setDataInicioProjeto(LocalDate.of(2018, 8, 20));
	p.setDataEntrega(LocalDate.of(2019, 6, 16));
//-------------Departamento-------------------------
	de.setSetor("Transporte");
	de.setNomeFantasia("Equipe das velhinhas");
//------------Relaçoes------------------------------	
	f.setDependente(Arrays.asList(d));
	f.setEquipe(e);
	
	d.setFuncionario(f);
	
	e.setFuncionario(Arrays.asList(f));
	e.setProjeto(Arrays.asList(p));
	e.setDepartamento(de);
	
	p.setEquipe(e);
	
	de.setEquipe(e);
	
	System.out.println(f);
	System.out.println("Aumento de Salario igual a :" + f.novoSalario());
	System.out.println(d);
	System.out.println(e);
	System.out.println(p);
	System.out.println(de);
	
	//System.out.println(f);
	
	
	
	
	
	
	
	
	
	
	
	
 }

}
