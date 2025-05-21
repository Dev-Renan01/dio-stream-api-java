package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class MaiorNumeroPrimo14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números existentes na lista: " + numeros);

       Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int)
                                Math.sqrt(n))
                        .allMatch(i -> n % i != 0))
                .max(Integer::compareTo);

        System.out.println("Maior número primo: " + maiorPrimo);
    }
}
