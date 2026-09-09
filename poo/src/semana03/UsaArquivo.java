package semana03;

public class UsaArquivo {

    public static void main(String[] args) {
        
        Arquivo.gravar();

        try {
            Arquivo.ler();
        }
        catch (Exception e) {
        }

    }

}
