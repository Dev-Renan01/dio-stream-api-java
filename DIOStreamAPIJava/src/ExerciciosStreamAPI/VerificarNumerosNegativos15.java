package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class VerificarNumerosNegativos15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-7, -6, -5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números existentes na lista: " + numeros);

        System.out.print("Números negativos na lista: ");
        numeros.stream()
                .filter(n -> n < 0)
                .forEach(n -> System.out.print(n + " "));

    }
}
