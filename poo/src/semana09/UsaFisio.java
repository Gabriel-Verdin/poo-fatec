package semana09;

public class UsaFisio {

    public static void main(String[] args) {
        
        Fisio pp = new Pessoa();
        Fisio pa = new Animal();
        Fisio pe = new ET();

        Vida v = new Vida();
        v.viver(pp);
 
        Vida v2 = new Vida();
        v2.viver(pa);

        Vida v3 = new Vida();
        v3.viver(pe);

    }

}
