package semana10;

public abstract class Motor {

    public int potencia;
    public String modelo;

    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();

    public void mostrar() {

    }
}