package semana06;

public class ContaBancaria {
    private final int NUMERO_LIMITE_CONTA = 100000;
    private final double VALOR_LIMITE_DEPOSITO = 10000;
    private final double VALOR_LIMITE_SAQUE = 1000;

    public String titular; // Não encapsulado
    private int numero; // Encapsulado
    private double saldo; // Encapsulado

    public void definirNumero(int n) {
        if(n < NUMERO_LIMITE_CONTA) {
            numero = n;
        }
    }

    // Escopo de instância (Pertence a partir do Objeto)
    public void depositar(double valor) {
        if (valor > 0 && valor <= VALOR_LIMITE_DEPOSITO) {
            saldo += valor;
        }
    }

    /**
     * Realiza o saque desde que o saldo seja suficiente
     * @param valor - O valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor <= VALOR_LIMITE_SAQUE) {
            if (saldo >= valor) {
                saldo -= valor;
            }
            else {
                System.out.println("Saldo Insuficiente!");
            }
        }
        else {
            System.out.println("Valor limite excedido! " + VALOR_LIMITE_SAQUE);
        }
    }

    // Escopo de classe (pertence a classe)
    public static String transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        String mensagem = "Transferência realizada com sucesso!";

        // Transação
        origem.sacar(valor);
        destino.depositar(valor);

        return mensagem;
    }

    public void mostrar() {
        System.out.println(titular);
        System.out.println(numero);
        System.out.println(saldo);
    }

}
