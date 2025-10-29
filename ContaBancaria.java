package DioDesafio2;

public class ContaBancaria {
	
	private int saldo;
	
    public ContaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
   
    }
    
   
    public int getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(int valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }
    
    	
    }
