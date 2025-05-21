package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomaDosQuadrados11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros);

        int somaDosQuadrados = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("A soma dos quadrados, de todos os números são: " + somaDosQuadrados);

    }

}
