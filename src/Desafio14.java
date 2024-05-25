import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumeroPrimo = numeros.stream().sorted(Collections.reverseOrder()).filter(Desafio14::isPrime).findFirst().get();
        System.out.println(maiorNumeroPrimo);
    }


    public static boolean isPrime(int num){
         for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
