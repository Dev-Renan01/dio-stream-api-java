package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumeros13 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números existentes na lista: " + numeros);

        System.out.print("Números no intervalo entre '5' e '10' são: ");
        numeros.stream()
                .filter(n -> n > 5 && n < 10)
                .forEach(n -> System.out.print(n + " "));

    }
}
