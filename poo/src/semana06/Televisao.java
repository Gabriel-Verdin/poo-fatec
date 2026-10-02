package semana06;

// Exercício Encapsulamento
// 3. Faça uma classe contendo atributos e métodos para implementar uma TV. Devem existir
// métodos para mudar o canal (de 0 a 999) e para definir o brilho contendo três valores (baixo,
// médio e alto). Elaborar também a classe UsaTv para testar as funcionalidades.

public class Televisao {
    // Constantes (Limites)
    private final int LIMITE_MAXIMO_CANAL = 999;
    private final int LIMITE_MINIMO_CANAL = 0;

    // Atributos
    private int canal = 10;
    private String brilho = "medio";

    // Getters e Setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal >= LIMITE_MINIMO_CANAL && canal <= LIMITE_MAXIMO_CANAL) {
            this.canal = canal;
        }
    }

    public String getBrilho() {
        return brilho;
    }

    // Usar .equals() ao comparar Objetos
    // .equaisIgnoreCase() ignora MAIÚSCULAS e minúsculas
    public void setBrilho(String brilho) {
        if (brilho.equalsIgnoreCase("baixo") || 
            brilho.equalsIgnoreCase("medio") || 
            brilho.equalsIgnoreCase("alto")) 
            {
            this.brilho = brilho;
        }
    }

    // Métodos
    public void aumentarCanal() {
        if(canal < LIMITE_MAXIMO_CANAL) {
            canal++;
        }
    }

    public void redizirCanal() {
        if(canal > LIMITE_MINIMO_CANAL) {
            canal--;
        }
    }

    public void mostrar() {
        System.out.println("Canal: " + canal);
        System.out.println("Brilho: " + brilho);
    }
}
