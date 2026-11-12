package semana09;

public class Automovel implements Motor, Capota {

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

    public void abrir() { // Vem da Interface Capota
        System.out.println("Abrindo a capota");
    }

    public void fechar() { // Vem da Interface Capota
        System.out.println("Fechando a capota");
    }

    public void mostrar() {
        
    }

}
