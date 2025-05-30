package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosDivisiveisPorTresECinco19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros);

       int soma = numeros.stream()
                .filter(n -> n %3 == 0 && n %5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma dos números divisiveis por três e cinco: " + soma);

    }
}
