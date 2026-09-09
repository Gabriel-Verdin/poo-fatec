package semana03;

import java.util.ArrayList;
import java.util.List;

public class ErroFatal {

    public static void main(String[] args) {
        
        List<byte[]> lista = new ArrayList<byte[]>(); 

        while(true) {
            lista.add(new byte[1024 * 1024]);
        }

    }

}
