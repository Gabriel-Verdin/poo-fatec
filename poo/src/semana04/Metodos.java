package semana04;

public class Metodos {

        // Um método sem o modificador somente pode ser usado dentro do próprio pacote
        public static  void imprimir() { // O que é o método
            System.out.println("Apostila de JAVA");
        }

        // Quando o método não é static, deve ser acessado por meio do Objeto
        public void imprimirSemStatic() { // O que é o método
            System.out.println("Apostila de JAVA - Sem static");
        }

        public static void imprimirTexto(String texto) {
            // imprimir();
            System.out.println(texto);
        }

        public static void somarVoid(int a, int b) {
            System.out.println(a+b);
            System.out.println("1");
        }

        public static void somarVoid(int a, float b) {
            System.out.println(a+b);
            System.out.println("2");
        }

        public static int somarInt(int a, int b) {
            return a + b; // Retorna para quem chamou o método
        }

    }
