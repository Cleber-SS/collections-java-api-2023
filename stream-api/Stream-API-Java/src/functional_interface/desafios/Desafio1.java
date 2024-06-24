package functional_interface.desafios;
import java.util.Arrays;
import java.util.List;

/*Crie um programa que utilize a Stream API
 para ordenar a lista de números em ordem crescente
  e a exiba no console.*/

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima todos os elementos da lista: ");
        //numeros.stream().forEach(System.out::println);
        numeros.forEach(System.out::println);
    }
}
