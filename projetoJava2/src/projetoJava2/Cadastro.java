package projetoJava2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro 
{
	protected String name;
	protected String email;
	protected String password;
	private Scanner leituraPessoa;
	private Scanner leituraEmpresa;
	
		public void cadastrarPessoa()
		{
			UsuarioComum pessoa = new UsuarioComum();
			leituraPessoa = new Scanner(System.in);
			ArrayList<UsuarioComum> listaPessoa = new ArrayList<UsuarioComum>();
			
			System.out.print("digite seu nome: ");
			pessoa.name = leituraPessoa.nextLine();
			
			System.out.print("digite seu sobrenome: ");
			pessoa.sobrenome = leituraPessoa.nextLine();
			
			System.out.print("digite seu email: ");
			pessoa.email = leituraPessoa.nextLine();
			
			System.out.print("digite sua senha: ");
			pessoa.password = leituraPessoa.nextLine();
			
			listaPessoa.add(pessoa);
			System.out.println(listaPessoa);
			
			
		}
		
	
		public void cadastrarEmpresa()
		{
			Empresa empresa = new Empresa();
			leituraEmpresa = new Scanner(System.in);
			ArrayList<Empresa> listaEmpresa = new ArrayList<Empresa>();
			
			System.out.print("digite o nome da empresa: ");
			empresa.name = leituraEmpresa.nextLine();
			
			System.out.print("digite o endereco da empresa: ");
			empresa.endereco = leituraEmpresa.nextLine();
			
			System.out.print("digite o email da empresa: ");
			empresa.email = leituraEmpresa.nextLine();
			
			System.out.print("digite o telefone da empresa: ");
			empresa.telefone = leituraEmpresa.nextLine();
			
			System.out.print("digite o cnpj da empresa: ");
			empresa.cnpj = leituraEmpresa.nextLine();
			
			System.out.print("digite o site da empresa: ");
			empresa.siteEmpresa = leituraEmpresa.nextLine();
			
			System.out.print("digite seu login: ");
			empresa.login = leituraEmpresa.nextLine();
			
			System.out.print("digite sua senha: ");
			empresa.password = leituraEmpresa.nextLine();
			
			listaEmpresa.add(empresa);
			System.out.println(listaEmpresa);
	}

	}

