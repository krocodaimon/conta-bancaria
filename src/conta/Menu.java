package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
	public static void main(String[] args) { 
		Scanner leia = new Scanner(System.in);

		int opcao;

        // Teste da Classe Conta
		Conta c1 = new Conta(3, 123, 1, "Mariana", 500000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
        
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
			
	     // Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
	    cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
			

		
		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "\n-----------------------------------------------------------");

			System.out.println("\n-----------------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("                     Carteirinha                              ");
			System.out.println("                                                     ");
			System.out.println("\n-----------------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("\n-----------------------------------------------------------");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
	
			opcao = leia.nextInt();
			// objeto leia, para armazenar na variavel opcao
			if (opcao == 9) {
				System.out.println("\nBanco do Brasil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Conta \n\n");
				break;
			case 2:
				System.out.println("Consultar dados da conta - por número\n\n");
				break;
			case 3:
				System.out.println("Atualizar dados da conta\n\n");
				break;
			case 4:
				System.out.println("Apagar a conta\n\n");
				break;
			case 5:
				System.out.println("Saque\n\n");
				break;
			case 6:
				System.out.println("Depósito\n\n");
				break;
			case 7:
				System.out.println("Transferência entre contas\n\n");
				break;
			case 8:
				System.out.println("Opção Inválida!\n\n");
				break;
				
			}
			

		}
	}
	public static void sobre () {
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("\n-----------------------------------------------------------");
	}
}