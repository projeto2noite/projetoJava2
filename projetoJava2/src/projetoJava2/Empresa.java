package projetoJava2;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa extends Cadastro
{
	String endereco, cnpj, telefone, siteEmpresa,login;
	
	public String getNome()
	{
		return name;
	}
	public String getEndereco()
	{
		return endereco;
	}
	
	public String getCnpj()
	{
		return cnpj;
	}
	
	public String getPhone()
	{
		return telefone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getSiteEmpresa()
	{
		return siteEmpresa;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public String getSenha()
	{
		return password;
	}
	
	public void setNome(String name)
	{
		this.name = name;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}
	
	public void setPhone(String telefone)
	{
		this.telefone = telefone;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setSiteEmpresa(String siteEmpresa)
	{
		this.siteEmpresa = siteEmpresa;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public void setSenha(String password)
	{
		this.password = password;
	}
	
	public void listarEmpresa()
	{
		Empresa empresa = new Empresa();
		Scanner leituraEmpresa = new Scanner(System.in);
		ArrayList<Empresa> ListaEmpresas = new ArrayList<Empresa>();
		
		/*for(int i = 0; i < ListaEmpresas.length; i++)
		{
			System.out.println(empresa.name);
		} */
		//criar lista array list
		//inserir nomes das empresas nessa lista
		//empresa.listarEmpresas
		//imprimir lista
		//listarEmpresa.add(empresa)
		
	}
	public String toString()
	{
		return name+" "+login+" "+endereco+" "+cnpj+" "+telefone+" "+email+" "+siteEmpresa;
	}
}
