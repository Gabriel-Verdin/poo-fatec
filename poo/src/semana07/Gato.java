package semana07;

public class Gato extends Animal{

    private String raca;

    public Gato() {
    }

    public Gato(int id, int idade, String nome, String raca) {
        super(id, idade, nome);
        this.raca = raca;
    }

    @Override 
    public void comer() {
        System.out.println("Gato comendo...");
    }

    // Sobrecarga realizada na subclasse
    public void comer(int gtdGramas) {
        System.out.println("Gato comendo... " + gtdGramas + " gramas");
    }

    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }

}
