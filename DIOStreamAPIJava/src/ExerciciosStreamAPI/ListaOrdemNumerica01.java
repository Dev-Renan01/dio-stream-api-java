package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ListaOrdemNumerica01 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Lista em ordem crescente: ");
        numeros.stream()
                .sorted()
                .forEach(n -> System.out.print(n + ", "));

    }
}


