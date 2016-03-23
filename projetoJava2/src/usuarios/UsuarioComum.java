package usuarios;

import projetoJava2.Cadastro;

public class UsuarioComum extends Cadastro
{
	
	public String sobrenome;

	
	public String getNome()
	{
		return name;
	}
	
	public long getCPF()
	{	
		return cpf;
	}
	public String getEmail()
	{
		return email;
	}
	
	public String getSenha()
	{
		return password;
	}
	
	public void setNome(String name)
	{
		this.name = name;
	}
	
	public void setCPF(long cpf)
	{
		this.cpf = cpf;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setSenha(String password)
	{
		this.password = password;
	}
	
	public String toString()
	{ 
		return email +" "+password +" "+name+" "+cpf;
	}
	

}