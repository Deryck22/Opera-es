package DioDesafio2;

import java.util.Scanner;

public class MenuBanco {
	
	private ContaBancaria conta;
    private Scanner sc;

    public MenuBanco(ContaBancaria conta, Scanner sc) {
        this.conta = conta;
        this.sc = sc;
    }

    public void exibirMenu() {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n========= Banco Central Opções ========");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Retirar valor");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    conta.depositar(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Digite o valor da retirada: ");
                    conta.sacar(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
