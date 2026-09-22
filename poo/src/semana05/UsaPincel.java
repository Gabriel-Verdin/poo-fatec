package semana05;

public class UsaPincel {

    public static void main(String[] args) {
        
        // 1. Declaração da variável de referência e alocação na memória com 'new' (Instânciação)
        Pincel p = new Pincel();

        // Exibe o estado inicial do objeto 'p'
        // Strings iniciam com 'null', numéricos (double) iniciam com '0.0'
        System.out.println("--- Estado Inicial do Pincel 'p' ---");
        p.mostrar();

        // 2. Alterando o estado do objeto (atribuindo valores aos atributos)
        p.cor = "Azul";
        p.fabricante = "Pilot";
        p.preco = 12.50;
        p.volume = 25.0;

        // Exibe o novo estado do objeto 'p'
        System.out.println("--- Estado do Pincel 'p' após Atribuições ---");
        p.mostrar();

        // 3. Criando uma nova instância (outro objeto com estado independente)
        Pincel p1 = new Pincel();
        p1.cor = "Vermelho";
        p1.fabricante = "Faber Castell";
        p1.preco = 15.00;
        p1.volume = 30.0;

        System.out.println("--- Estado do Pincel 'p1' ---");
        p1.mostrar();

        Pincel p2 = new Pincel();
        p1.cor = "Vermelho";
        p1.fabricante = "Pilot";
        p1.preco = 12.34;
        p1.volume = 10.0;

        // Impressão via método costumizado 'mostrar()'
        System.out.println("--- Exibição via método mostrar() ---");
        p2.mostrar();

        // Impressão diretoa do objeto
        // Como o método 'toString()' está implementado na classe Pincel,
        // o println o chama automaticamento para exibir o conteúdo formatado.
        System.out.println("--- Exibição direta do objeto p2 (usa toString automaticamente) ---");
        System.out.println(p1);

        // Instanciação do segundo pincel (p2) com valores parciais
        Pincel p3 = new Pincel();
        p3.cor = "Verde";
        
        System.out.println("\n--- Exibição direta do objeto p3 ---");
        System.out.println(p3); // Exibe: [Verde; null; 0.0; 0.0]

    }

}
