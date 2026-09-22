package semana05;

public class Pincel {

    // Atributos de Instância (Variáveis de Instância / Propriedades)

    // Visibilidade PÚBLICA: visível em todo o projeto

    // Na UML: + cor: String
    public String cor;

    // Na UML: + fabricante: String
    public String fabricante;

    // Na UML: + preco: double
    public double preco;

    // Na UML: + volume: double
    public double volume;

    // Se o modificador for omitido (ex: String cor;), a visibilidade será de PACOTE (default),
    // tornando o atributo acessível apenas por classes que pertençam ao mesmo pacote (semana05)

    /**
     * Método de Instância: apresenta em tela o estado atual do objeto (conteúdo dos atributos).
     * Na UML: + mostrar(): void
    */
    public void mostrar() {
        System.out.println("Cor: " + cor);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Preço: " + preco);
        System.out.println("Volume: " + volume);
        System.out.println("--------------------------------");
    }

    /**
     * Método padrão do Java para retornar o estado do objeto em formato de texto.
     * É invocado automaticamente pelo System.out.println(objeto) 
    */
   @Override
   public String toString() {
    return "[" + cor + "; " + fabricante + ": " + preco + "; " + volume + "]";
   }
        
}
