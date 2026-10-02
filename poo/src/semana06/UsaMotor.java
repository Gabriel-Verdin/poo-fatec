package semana06;

public class UsaMotor {
 
    public static void main(String[] args) {
        
        Motor motor01 = new Motor();

        motor01.fabricante = "VW";
        motor01.ligar();

        for(int i=1; i<=1000; i++) {
            motor01.acelerar();
        }

        motor01.frear();

        motor01.mostrar();
    
    }

}
