package atividadeExercicios;

import java.util.Arrays;
import java.util.List;

public class ExerciciosTestLista07 {

    public static void main(String[] args) {
        
        ExercicioLista07.apresentarPalavras("Fatec");
        ExercicioLista07.mostrarTabuada(10);
        ExercicioLista07.imprimirCincoNumeros();
        ExercicioLista07.mostrarDiaSemana(3);
        ExercicioLista07.exibirNomesLista(List.of("Gabriel", "João", "Maria"));
        System.out.println("Números pares: " + ExercicioLista07.numerosParesLista(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println("Soma: " + ExercicioLista07.somaNumerosLista(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("Média Aritmética: " + ExercicioLista07.mediaAritimetica(new double[]{2.5, 10, 5.6, 8.2}));
        System.out.println("Valores compreendidos: " + Arrays.toString(ExercicioLista07.valoresCompreendidos(10, 20)));
        System.out.println("CPF válido: " + ExercicioLista07.verificarCpf("123.445.678-90"));

    }   
}
