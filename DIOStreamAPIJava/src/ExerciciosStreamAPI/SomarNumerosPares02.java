package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomarNumerosPares02 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Números Pares: ");

             numeros.stream()
            .filter(n -> n %2 == 0)
            .forEach(n -> System.out.print(n + ", "));

        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n.intValue())
                .sum();


        System.out.println("Soma dos números pares: " + somaPares);


    }
}
