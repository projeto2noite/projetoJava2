package projetoJava2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro 
{
	String name, cpf, email,password;
	
		public void cadastrarPessoa()
		{
			
			UsuarioComum pessoa = new UsuarioComum();
			Scanner leituraPessoa = new Scanner(System.in);
			ArrayList<UsuarioComum> listaPessoa = new ArrayList<UsuarioComum>();
			
			System.out.print("Nome Completo: ");
			pessoa.name = leituraPessoa.next();
			
			System.out.print("CPF: ");
				pessoa.cpf = leituraPessoa.next();
				//validação do CPF, precisa testar!!!
				//if(ValidarCPF.isCPF(cpf) != true)
					//do {
					//	System.out.printf("Erro, CPF invalido! Tente novamente\n");
					//	pessoa.cpf = leituraPessoa.next();
					//} while (ValidarCPF.isCPF(cpf) != true);
				
			System.out.print("E-mail: ");
			pessoa.email = leituraPessoa.next();
			
			System.out.print("Senha: ");
			pessoa.password = leituraPessoa.next();
			
			listaPessoa.add(pessoa);
			System.out.println(listaPessoa);
			
			
		}
		
	
		public void cadastrarEmpresa()
		{
			Empresa empresa = new Empresa();
			Scanner leituraEmpresa = new Scanner(System.in);
			ArrayList<Empresa> listaEmpresa = new ArrayList<Empresa>();
			
			System.out.print("digite o nome da empresa: ");
			empresa.name = leituraEmpresa.nextLine();
			
			System.out.print("digite o endereco da empresa: ");
			empresa.endereco = leituraEmpresa.nextLine();
			
			System.out.print("digite o cnpj da empresa: ");
			empresa.cpf = leituraEmpresa.nextLine();
			//testar também, alguém tem um cnpj aí?
				//if(ValidarCNPJ.isCNPJ(cpf) != true)
					//do {
					//	System.out.printf("Erro, CNPJ invalido! Tente novamente\n");
					//	empresa.cpf = leituraEmpresa.nextLine();
					//} while (ValidarCNPJ.isCNPJ(cpf) != true);
			
			System.out.print("digite o email da empresa: ");
			empresa.email = leituraEmpresa.nextLine();
			
			System.out.print("digite o telefone da empresa: ");
			empresa.telefone = leituraEmpresa.nextLine();
			
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

