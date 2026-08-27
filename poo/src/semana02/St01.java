package semana02;

public class St01 {

    public static void main(String[] args) {
        
        String s = "Gabriel Verdin";

        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.contains("el"));
        System.out.println(s.charAt(0));
        System.out.println(s.substring(0, 7));
        System.out.println(s.substring(8)); // Do 8 até o final

        System.out.println("-----------------------------------------");

        String stringSplit = "Gabriel;Gonçalves;Verdin;da;Silva";
        String[] dados = stringSplit.split(";");
        for(String dado:dados) {
            System.out.println(dado);
        }
        
    }

}
