package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ProdutoNumeroLista12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros);

        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Produtos dos números: " + produto);
    }
}
