package semana07;

public class Elefante extends Animal{

    private int comprimentoTromba;

    public Elefante() {
    }

    public Elefante(int id, int idade, String nome, int comprimentoTromba) {
        super(id, idade, nome);
        this.comprimentoTromba = comprimentoTromba;
    } 

    @Override 
    public void comer() {
        System.out.println("Elefante comendo...");
    }

    public int getComprimentoTromba() {
        return comprimentoTromba;
    }

    public void setComprimentoTromba(int comprimentoTromba) {
        this.comprimentoTromba = comprimentoTromba;
    }

}
