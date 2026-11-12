package semana09;

import semana08.Veiculo;

public class Ferrari extends Veiculo
            implements Turbo {

    public void ligar() { // Vem da Interface Motor
        System.out.println("Ligando o automóvel");
    }

    public void desligar() { // Vem da Interface Motor
        System.out.println("Desigando o automóvel");
    }

    public void acelerar() { // Vem da Interface Motor
        System.out.println("Acelerando o automóvel");
    }

    public void frear() { // Vem da Interface Motor
        System.out.println("Freando o automóvel");
    }

    public void acionar() {
        System.out.println("Acionando o turbo"); // Vem da Interface Turbo
    } 

    public void interromper() {
        System.out.println("Interrompendo o turbo"); // Vem da Interface Turbo
    }

}
