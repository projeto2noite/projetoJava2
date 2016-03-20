package projetoJava2;
import java.util.Scanner;

	public class Inicio {
		
		public static void menu () {
			System.out.println("Pressione:");
			System.out.println("1 - Para Entrada de material recicl�vel");
			System.out.println("2 - Para Sa�da de material recicl�vel");
			System.out.println("3 - Para Cadastros");
			System.out.println("4 - Para pesquisas");
			System.out.println("5 - Para relat�rio de movimenta��o");
			System.out.println("6 - Para sair");
		}
		
		public static void main(String[] args){
			
			Scanner entrada = new Scanner(System.in);
			
			menu();
			
			byte opcaoEscolhida = entrada.nextByte();
			
			switch (opcaoEscolhida) {
			case 1:
				//incluir m�todo/classe de entrada
				break;
				
			case 2:
				//incluir m�todo/classe de sa�da
				break;
				
			case 3:
				Cadastro cadastro = new Cadastro();
				System.out.println("Qual tipo de usu�rio voc� pretende cadastrar ?");
				System.out.println("1 - Pessoa Comum");
				System.out.println("2 - Pessoa Jur�dica (empresa)");
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
				//incluir m�todo/classe de pequisa
				break;
				
			case 5:
				//incluir m�todo/classe de relat�rios
				break;
				
			case 6:
				System.exit(0);
			}
			
					
		}
	}
