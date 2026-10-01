package atividadeExercicios;

import java.util.List;

public class Lista07Exercicio {

    public static void apresentarPalavras(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }

    public static void mostrarTabuada(int numero) {
        if (numero >= 1 && numero <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Número inválido. Digite um número entre 1 e 10.");
        }
    }

    public static void imprimirCincoNumeros() {
        for (int i = 0; i < 5; i++) {
            int n = (int) (Math.random() * 100);
            System.out.println(n);
        }
    }

    public static void mostrarDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Digite um número entre 1 e 7.");
        }
    }

    public static void exibirNomesLista(List<String> nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static int numerosParesLista(List<Integer> numeros) {
        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int somaNumerosLista(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static double mediaAritimetica(double[] args) {
        double soma = 0;
        for (double numero : args) {
            soma += numero;
        }
        return soma / args.length;
    }

    public static int[] valoresCompreendidos(int numero01, int numero02) {
        int[] valores = new int[numero01];

        for (int i = 0; i < numero01; i++) {
            valores[i] = (int) (Math.random() * numero02);
        }

        return valores;
    }

    public static boolean verificarCpf(String cpf) {

        if (cpf.strip().length() == 14) {
            if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                System.out.println("CPF válido.");
                return true;
            }
            else {
                System.out.println("CPF inválido. Digite um CPF no formato ddd.ddd.ddd-dd.");
                return false;
            }
        }
        else {
            System.out.println("CPF inválido. Digite um CPF com 14 caracteres.");
            return false;
        }
    }
}
