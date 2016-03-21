package projetoJava2;



public class UsuarioComum extends Cadastro
{
	String cpf;
	
	public String getNome()
	{
		return name;
	}
	
	public String getCPF()
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
	
	public void setCPF(String cpf)
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