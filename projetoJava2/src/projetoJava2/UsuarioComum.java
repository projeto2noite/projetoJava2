package projetoJava2;

//nao ta imprimindo nome e sobrenome 
//acho que e problema do tamanho da lista


public class UsuarioComum extends Cadastro
{
	String sobrenome;
	
	public String getNome()
	{
		return name;
	}
	
	public String getSobrenome()
	{
		return sobrenome;
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
	
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
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
		return email +" "+password +" "+name+" "+sobrenome;
	}
	

}