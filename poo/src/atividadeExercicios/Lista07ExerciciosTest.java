package atividadeExercicios;

import java.util.Arrays;
import java.util.List;

public class Lista07ExerciciosTest {

    public static void main(String[] args) {
        
        Lista07Exercicio.apresentarPalavras("Fatec");
        Lista07Exercicio.mostrarTabuada(10);
        Lista07Exercicio.imprimirCincoNumeros();
        Lista07Exercicio.mostrarDiaSemana(3);
        Lista07Exercicio.exibirNomesLista(List.of("Gabriel", "João", "Maria"));
        System.out.println("Números pares: " + Lista07Exercicio.numerosParesLista(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println("Soma: " + Lista07Exercicio.somaNumerosLista(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("Média Aritmética: " + Lista07Exercicio.mediaAritimetica(new double[]{2.5, 10, 5.6, 8.2}));
        System.out.println("Valores compreendidos: " + Arrays.toString(Lista07Exercicio.valoresCompreendidos(10, 20)));
        System.out.println("CPF válido: " + Lista07Exercicio.verificarCpf("123.445.678-90"));

    }   
}
