
package semana06;

public class TerminalBancario {

    public static void main(String[] args) {
        
        // ContaBancaria conta01 = new ContaBancaria();

        // conta01.titular = "Gabriel Verdin";
        // conta01.definirNumero(10);

        // conta01.depositar(1500);
        // conta01.sacar(1000);

        // conta01.mostrar();

        ContaBancaria conta01 = new ContaBancaria();
        conta01.titular = "João";
        conta01.depositar(1000);

        ContaBancaria conta02 = new ContaBancaria();
        conta02.titular = "Maria";
        
        ContaBancaria.transferir(conta01, conta02, 200);

        conta01.mostrar();
        System.out.println("----------------");
        conta02.mostrar();

    }

}
