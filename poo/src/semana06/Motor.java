package semana06;

public class Motor {

    private final int VELOCIDADE_MAXIMA = 100;
    private final int VELOCIDADE_MINIMA = 0;

    // Atributos
    public String fabricante;
    private int velocidade;
    private boolean status;

    // Métodos
    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public void acelerar() {
        if(status) {
            if(velocidade < VELOCIDADE_MAXIMA) {
                velocidade++;
            }
        }
    }

    // public String acelerar() {
    //     String mensagem = "";
    //     if (velocidade < VELOCIDADE_MAXIMA) {
    //         velocidade++;
    //         mensagem = "Velociadade atual: " + velocidade;
    //     }
    //     else {
    //         mensagem = "Velocidade Máxima atingida: " + VELOCIDADE_MAXIMA;
    //     }
    //     return mensagem;
    // }

    public void frear() {
        if(velocidade > VELOCIDADE_MINIMA) {
            velocidade--;
        }
    }

    public void mostrar() { // Imprime o estado atual
        System.out.println(fabricante);
        System.out.println(velocidade);
        System.out.println(status);
    }

}
