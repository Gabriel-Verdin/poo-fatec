package semana02;

public class SenhaAlfanumerica {

    public static void main(String[] args) {
        
        String s = "0123456789!@#$%¨&*()ABCDEFabcdef|;<>,{?";
        // 0, 38

        String senha = "";
        for(int i=1;i<=10;i++) {

            int n = (int) (Math.random()*s.length());
            senha += s.charAt(n);
            
        }
        System.out.println("Senha: " + senha);

    }

}
