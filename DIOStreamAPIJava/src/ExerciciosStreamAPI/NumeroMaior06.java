package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class NumeroMaior06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.print("Números existentes na lista: " );
        numeros.stream()
                .forEach(n -> System.out.print(n + ", "));

        boolean VouF = numeros.stream()
                .allMatch(n -> n > 10);
        System.out.println();
        System.out.println("Números maior que 10: " + VouF);
    }
}
