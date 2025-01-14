import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPorTresEPorCinco = numeros.stream().filter(n -> (n % 3 == 0) && (n % 5 == 0)).reduce(0, Integer::sum);
        int somaPorTresOuPorCinco = numeros.stream().filter(n -> (n % 3 == 0) || (n % 5 == 0)).reduce(0, Integer::sum);

        System.out.println("Soma dos números divisivéis por 3 ou por 5: " + somaPorTresOuPorCinco);
        System.out.println("Soma dos números divisivéis tanto por 3 quanto por 5: " + somaPorTresEPorCinco);
    }
}
