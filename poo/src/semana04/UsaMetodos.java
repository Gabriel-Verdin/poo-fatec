package semana04;

import semana03.Metodos2;

public class UsaMetodos {

    public static void main(String[] args) {
        
        Metodos m = new Metodos();
        m.imprimirSemStatic();

        Metodos.imprimir(); // Chamar ou invocar

        Metodos.imprimirTexto("Olá");

        // Metodos.imprimir2() Não funciona se não for importado o pacote onde está o método (import semana03.Metodos)

        // semana03.Metodos2.imprimir2();
        Metodos2.imprimir2(); // Após importar, funciona  

        Metodos.somarVoid(5, 10); // Printa o valor, porém não é possivel fazer nada com o resultado
        Metodos.somarVoid(5, 5.5f);

        int resultado = Metodos.somarInt(5, 10); // Retorna o resultado, possível de ser usado.
        System.out.println("Resultado: " + resultado);

    }

}   
