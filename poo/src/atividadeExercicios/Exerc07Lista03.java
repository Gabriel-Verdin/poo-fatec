package atividadeExercicios;

public class Exerc07Lista03 {

    public static void main(String[] args) {

        for(int i = 10; i <= 100; i += 10) {

            int celcius = i;
            int fahrenheit = (celcius * 9/5) + 32;

            System.out.println("Celcius: " + celcius + "°C = " + "Fahrenheit: " + fahrenheit + "°F");

        }

    }

}
