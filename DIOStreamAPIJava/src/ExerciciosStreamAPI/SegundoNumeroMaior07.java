package ExerciciosStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoNumeroMaior07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números na lista: " + numeros);

        Optional<Integer> segundoMaiorNumero = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1L)
                .findFirst();
        System.out.println("O segundo maior número é: " + segundoMaiorNumero.get());


    }
}
