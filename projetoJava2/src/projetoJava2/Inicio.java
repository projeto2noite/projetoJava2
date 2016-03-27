package projetoJava2;
import java.util.Scanner;

	public class Inicio {
		
		public static void menu () {
			System.out.println("Pressione:");
			System.out.println("1 - Para Entrada de material reciclavel");
			System.out.println("2 - Para Saida de material reciclavel");
			System.out.println("3 - Para Cadastros");
			System.out.println("4 - Para pesquisas");
			System.out.println("5 - Para relatorio de movimentacao");
			System.out.println("6 - Para sair");
		}
		
		public static void main(String[] args){
			
			Scanner entrada = new Scanner(System.in);
			
			menu();
			
			byte opcaoEscolhida = entrada.nextByte();
			
			switch (opcaoEscolhida) {
			case 1:
				EntradaDeMaterial entradaMaterial = new EntradaDeMaterial();
				break;
				
			case 2:
				SaidaDeMaterial saidaMaterial = new SaidaDeMaterial();
				break;
				
			case 3:
				Cadastro cadastro = new Cadastro();
				System.out.println("Qual tipo de usuario voce pretende cadastrar ?");
				System.out.println("1 - Pessoa Comum");
				System.out.println("2 - Pessoa Juridica (empresa)");
				Scanner leituraOpcao = new Scanner(System.in);
				byte opcao = leituraOpcao.nextByte();
				
				if(opcao == 1)
				{
					cadastro.cadastrarPessoa();
				}else if(opcao == 2)
				{
					cadastro.cadastrarEmpresa();
				}
				
				break;
				
			case 4:
				//incluir metodo/classe de pequisa (precisa do banco)
				break;
				
			case 5:
				//incluir metodo/classe de relatorios (precisa do banco)
				break;
				
			case 6:
				System.exit(0);
			}
			
					
		}
	}
