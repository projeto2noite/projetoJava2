package projetoJava2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro 
{
	String name,email,password;

	public static void main(String[] args) 
	{
		System.out.println("Qual tipo de usuário você pretende cadastrar ?");
		System.out.println("1 - Pessoa Comum");
		System.out.println("2 - Pessoa Jurídica (empresa)");
		Scanner leituraOpcao = new Scanner(System.in);
		int opcao = leituraOpcao.nextInt();
		
		
		switch(opcao) 
		{
		
		case 1:
			
			UsuarioComum pessoa = new UsuarioComum();
			Scanner leituraPessoa = new Scanner(System.in);
			ArrayList<UsuarioComum> listaPessoa = new ArrayList<UsuarioComum>();
			
			System.out.print("digite seu nome: ");
			pessoa.name = leituraPessoa.nextLine();
			
			System.out.print("digite seu sobrenome: ");
			pessoa.sobrenome = leituraPessoa.nextLine();
			
			System.out.print("digite seu email: ");
			pessoa.name = leituraPessoa.nextLine();
			
			System.out.print("digite sua senha: ");
			pessoa.sobrenome = leituraPessoa.nextLine();
			
			listaPessoa.add(pessoa);
			System.out.print(listaPessoa);
			
			break;

		case 2:
			
			Empresa empresa = new Empresa();
			Scanner leituraEmpresa = new Scanner(System.in);
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
			
			break;
			
		default:
			
			System.out.println("Opcao invalida");
			
			break;
		}

	}

}
