package semana02;

import java.util.ArrayList;
import java.util.List;

public class For06 {

    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<String>();
        nomes.add("Gabriel");
        nomes.add("Lucas");
        nomes.add("Marcos");
        nomes.add("Warley");
        
        for(String nome:nomes) {
            System.out.println("Nome: " + nome);
        }

    }

}
