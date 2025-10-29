package DioDesafio2;

import java.util.Scanner;

public class Banco {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000); // saldo inicial
        MenuBanco menu = new MenuBanco(conta, sc);
        menu.exibirMenu();
        sc.close();
    }
}
