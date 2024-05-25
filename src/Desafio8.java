import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int soma = verificarNumeroMaiorQueNove(numeros);

        soma += numeros.stream().filter(n -> n < 10).reduce(0, Integer::sum);
        System.out.println(soma);
    }

    public static int contador(int num){
        int cont = 0;
        while (num != 0){
            num /= 10;
            cont++;
        }
        return cont;
    }

    public static int verificarNumeroMaiorQueNove(List<Integer> numeros){
        int aux = 0;
        int soma = 0;
        while(aux < numeros.size()){
            if(numeros.get(aux) > 9){
                int numAux = numeros.get(aux);
                int divAux = 0;
                while(divAux < contador(numAux)){
                    soma += numAux % 10;
                    numAux /= 10;
                }
            }
            aux++;
        }
        return soma;
    }
}

