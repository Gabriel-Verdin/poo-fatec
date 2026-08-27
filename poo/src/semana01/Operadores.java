package semana01;

public class Operadores {

    public static void main(String[] args) {
    
        int a = 5; // 101
        int b = 3; // 011

        System.out.println(a | b); // 7
        System.out.println(a & b); // 1

        /*
        0 000
        1 001
        2 010
        3 011
        4 100
        5 101
        6 110
        7 111
        */

        System.out.println("=====================================================");
        int num = 10;

        System.out.println(num++); // 10
        System.out.println(++num); // 12

        num = num + 1; // 11
        num ++; // 12
        num += 5; // 17   
        num *= 2; // 34

        System.out.println(num);

    }

}
