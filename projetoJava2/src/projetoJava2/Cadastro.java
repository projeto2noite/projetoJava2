package projetoJava2;

import java.util.ArrayList;
import java.util.Scanner;

import usuarios.Empresa;
import usuarios.UsuarioComum;

public class Cadastro 
{

	protected String name;
	protected String email;
	protected String password;
	protected String CPF;
	private Scanner leituraPessoa;
	private Scanner leituraEmpresa;


	
		public void cadastrarPessoa()
		{
			
			UsuarioComum pessoa = new UsuarioComum();
			leituraPessoa = new Scanner(System.in);
			ArrayList<UsuarioComum> listaPessoa = new ArrayList<UsuarioComum>();
			
			System.out.print("Nome Completo: ");
			pessoa.name = leituraPessoa.next();
			
			System.out.print("CPF: ");
			pessoa.CPF = leituraPessoa.next();
				//validaçao do CPF, precisa fazer mais testes!!!
                if(CNP.isValidCPF(pessoa.CPF) != true) {
                    do {
                        System.out.printf("Erro, CPF invalido! Tente novamente\n");
                        pessoa.CPF = leituraPessoa.next();
                    } while (CNP.isValidCPF(pessoa.CPF) != true);
				}
			
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
			leituraEmpresa = new Scanner(System.in);
			ArrayList<Empresa> listaEmpresa = new ArrayList<Empresa>();
			
			System.out.print("digite o nome da empresa: ");
			empresa.name = leituraEmpresa.nextLine();
			
			System.out.print("digite o endereco da empresa: ");
			empresa.endereco = leituraEmpresa.nextLine();
			
			System.out.print("digite o cnpj da empresa: ");
			empresa.cnpj = leituraEmpresa.next();
			//testar tambem, alguem tem um cnpj ai?
			// NAO CONSEGUI COLOCAR CNPJ COMO PROTECTED, DA ERRO :(
			if(CNP.isValidCNPJ(empresa.cnpj) != true) {
                do {
                    System.out.printf("Erro, CPF invalido! Tente novamente\n");
                    empresa.cnpj = leituraPessoa.next();
                } while (CNP.isValidCPF(empresa.cnpj) != true);
			}
			
			System.out.print("digite o email da empresa: ");
			empresa.email = leituraEmpresa.next();
			
			System.out.print("digite o telefone da empresa: ");
			empresa.telefone = leituraEmpresa.nextLong();
			
			System.out.print("digite o site da empresa: ");
			empresa.siteEmpresa = leituraEmpresa.next();
			
			System.out.print("digite seu login: ");
			empresa.login = leituraEmpresa.next();
			
			System.out.print("digite sua senha: ");
			empresa.password = leituraEmpresa.next();
			
			listaEmpresa.add(empresa);
			System.out.println(listaEmpresa);
	}

	}

