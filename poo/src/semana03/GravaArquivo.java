package semana03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GravaArquivo {

    public static void main(String[] args) throws FileNotFoundException{
        
        String arquivo = "/home/gabrielverdin/Documentos/ws_vscode/poo/Arquivos/alunos.txt";

        // PrintWriter pw = new PrintWriter(arquivo);

        try {
            PrintWriter pw = new PrintWriter(arquivo);
            pw.println("Gustavo");
            pw.println("Ezequiel");
            pw.println("Gabriel");
            pw.close();
            System.out.println("Arquivo gerado com sucesso");
        } 

        catch (FileNotFoundException e) {
            System.out.println("Falha ao gravar o arquivo!");
        }

    }

}
