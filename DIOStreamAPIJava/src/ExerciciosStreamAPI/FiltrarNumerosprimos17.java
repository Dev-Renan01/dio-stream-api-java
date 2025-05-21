package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumerosprimos17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros);

        System.out.print("Números primos filtrados: ");
        numeros.stream().distinct().filter(n -> {
            if (n < 2)
                return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }).forEach(n -> System.out.print(n + " "));
    }
}
