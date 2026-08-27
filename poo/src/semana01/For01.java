package semana01;

public class For01 {

    public static void main(String[] args) throws InterruptedException {
    
        for(char c='A';c <= 'z';c++) {
            System.out.println(c);
            Thread.sleep(300);
        }
        
        for(int a = 1; a <= 10; a++) {
            System.out.println(a);
            Thread.sleep(1000);
        }

        for(int a = 10; a >= 0; a--) {
            System.out.println(a);
            Thread.sleep(1000);
        }

    }

}
