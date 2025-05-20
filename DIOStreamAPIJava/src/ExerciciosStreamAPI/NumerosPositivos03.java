package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class NumerosPositivos03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros + ", ");

        System.out.print("Números positivos: ");
        numeros.stream()
                .filter(n -> n > 0)
                .forEach(n -> System.out.print(n + ", "));

        System.out.println();
        System.out.print("Todos os números são positivos? ");

        boolean VouF = numeros.stream()
                .allMatch(n -> n > 0);

        System.out.print(VouF);

    }
}
