package semana08;

public class UsaVeiculo {

    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        v.roda.aro = 18;
        v.motor.descricao = "120 Cavalos";

        Pessoa p = new Pessoa();
        p.nome = "Paulo";

        v.definirMotorista(p); // Agregação
    }

}   
