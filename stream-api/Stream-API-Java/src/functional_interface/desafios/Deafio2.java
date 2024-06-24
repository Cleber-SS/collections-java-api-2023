package functional_interface.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/*Utilizando a Stream API, realize a soma dos números pares da lista
 e exiba o resultado no console.*/
public class Deafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Lista com apenas os números: " + numerosPares);


        int somaDosNumerosPares = numeros.stream()
                .filter(n -> (n % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma dos números parez: " + somaDosNumerosPares);
    }
}
