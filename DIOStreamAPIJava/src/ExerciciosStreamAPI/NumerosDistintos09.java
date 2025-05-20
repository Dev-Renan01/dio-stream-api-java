package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class NumerosDistintos09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números existentes na lista: " + numeros );

      boolean numerosDistintos = numeros.size() == numeros.stream()
                .distinct()
                .count();

        System.out.println("Todos os números são distintos? " + numerosDistintos);


    }
}
