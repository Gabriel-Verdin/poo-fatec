package semana06;

public class Pessoa {

    private int codigo;
    private String cpf, nome;
    private char sexo;
    private float altura, peso;

    // Para cada atributo privado, deve-se criar dois métodos públicos
    // 12 Métodos

    // Getters - Pegam os valores
    public int getCodigo() {
        return codigo;
    }

    // Setters - Guardam os valores
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Pessoa [Codigo=" + codigo +
                ", cpf=" + cpf + 
                ", nome=" + nome +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                "]";
    }

}
