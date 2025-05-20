package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomarTodosAlgarismos08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros);
      int soma = numeros.stream()
              .mapToInt(n -> n.intValue())
              .sum();
        System.out.println("Soma de todos os números da lista: " + soma);

    }
}
