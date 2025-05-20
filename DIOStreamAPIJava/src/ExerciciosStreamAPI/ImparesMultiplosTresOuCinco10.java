package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ImparesMultiplosTresOuCinco10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números existentes na lista: " + numeros);

        System.out.print("Números divisíveis por '3': ");
        numeros.stream()
                .distinct()
                .filter(n -> n %2 == 1)
                .filter(n -> n %3 == 0 )
                .forEach(n -> System.out.print(n + ", "));


        System.out.println();
        System.out.print("Números divisíveis por '5': ");
        numeros.stream()
                .distinct()
                .filter(n -> n %2 == 1)
                .filter(n ->  n %5 == 0)
                .forEach(n -> System.out.print(n + ", "));


        System.out.println();
        System.out.print("Números divisíveis por '3' ou '5': ");
            numeros.stream()
                .distinct()
                .filter(n -> n %2 == 1)
                .filter(n -> n %3 == 0 || n %5 == 0)
                .forEach(n -> System.out.print(n + ", "));

    }
}
