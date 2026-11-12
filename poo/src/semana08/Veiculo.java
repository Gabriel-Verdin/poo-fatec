package semana08;

public class Veiculo {

    public String modelo, marca;
    public Pessoa motorista;

    public Roda roda = new Roda();
    public Motor motor = new Motor();

    public void definirMotorista(Pessoa p) {
        motorista = p;
    }
}   
/**
 * Ao criar um veículo, são criadas as rodas e o motor.
 * 
 *  Veiculo v = new Veiculo(); // 3 objetos (Veiculo, Roda e Motor)
 *  Time Life é o mesmo
 */