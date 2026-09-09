package semana03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Arquivo {

    public static void gravar() {

        String arquivo = "/home/gabrielverdin/Documentos/ws_vscode/poo/Arquivos/alunos.txt";

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
    
    public static void ler() throws Exception { // Passo a responsabilidade

        String arquivo = "/home/gabrielverdin/Documentos/ws_vscode/poo/Arquivos/alunos.txt";

        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
        
    }

}
