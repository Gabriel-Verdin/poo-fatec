package semana05;

public class Impressora {

    // Método de instância (não estático) que simula a impressão de 10 páginas
    public void imprimir(String texto) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(texto + " - Página " + i);

            // Pausa de 500 milissegundos para simular a lentidão da impressão
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
