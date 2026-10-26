package semana07;

// public - 

// private - 

// protected: (quando é visivel???)
    // Quando no mesmo pacote, funciona como público. 
    // Quando em pacote diferente, funciona como privado. ** 
    // Quando dentro da mesma hierarquia de classes funciona como público.

// package - 

public abstract class Animal { // Classes abstratas são apenas um conceito, Não criam objetos
    // Constantes (Limitadores)
    final int IDADE_MINIMA = 0;
    final int IDADE_MAXIMA = 120;

    // Atributos
    protected int id; 
    private int idade;
    private String nome;

    // Construtor
    public Animal() {
    }

    public Animal(int id, int idade, String nome) {
        this.id = id;
        // this.idade = idade;
        setIdade(idade); // Anula a falha de segurança do construtor
        this.nome = nome;
    }

    // Método
    public void comer() {
        System.out.println("Animal comendo...");
    }

    // Getters and Setters
    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > IDADE_MINIMA && idade < IDADE_MAXIMA) { 
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
