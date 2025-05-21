package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class NumerosParesImpares16 {
    public static void main(String[] args) {
        List<Integer> numerosPares = Arrays.asList
                ( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numerosPares );

        System.out.print("Apenas os numeros pares: ");
        numerosPares.stream()
                .filter(n -> n %2 == 0)
                .forEach(n -> System.out.print(n + " "));


        System.out.println();
        System.out.println("-----------------------------------------");

        List<Integer> numerosImpares = Arrays.asList
                ( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numerosImpares );


        System.out.print("Apenas os numeros ímpares: ");

        numerosImpares.stream()
                .distinct()
                .filter(n -> n %2 == 1)
                .forEach(n -> System.out.print(n + " "));
    }
}
