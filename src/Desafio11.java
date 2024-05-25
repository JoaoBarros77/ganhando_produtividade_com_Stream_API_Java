import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int resultadoSomadoQuadrado = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
        double resultadoQuadradodaSoma = Math.pow(numeros.stream().reduce(0, Integer::sum), 2);
        System.out.println("O valor da soma dos quadrados dos numeros é igual a " + resultadoSomadoQuadrado);
        System.out.println("O valor do quadrado da soma dos numeros é igual a " + resultadoQuadradodaSoma);
    }
}
