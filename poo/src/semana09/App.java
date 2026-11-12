package semana09;

public class App {

    public static void main(String[] args) {
        
        Motor m; // Polimorfismo

        m = new Navio();
        m.ligar();
        m.desligar();
        m.acelerar();
        m.frear();

    }

}
 