package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class CalcularMedia05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


     OptionalDouble calcularMedia = numeros.stream()
                .filter(n -> n > 5)
              .mapToInt(n -> n.intValue())
              .average();

        System.out.println("Média dos números maiores que 5: " + calcularMedia);
    }
}
