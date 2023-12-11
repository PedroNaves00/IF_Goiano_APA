import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class QuickSortMediana {

    public static void quicksort ( int[] arr, int low, int high){
        if (low < high) {
            // Escolha o pivô como sendo a mediana
            int pi = (low + high) / 2;

            // Particione o vetor em torno do pivô
            int i = partition(arr, low, high, pi);

            // Retorne a chamada recursiva para as duas sublistas
            quicksort(arr, low, i - 1);
            quicksort(arr, i + 1, high);
        }
    }


    private static int partition ( int[] arr, int low, int high, int pi){
        // O pivô é colocado na posição correta
        swap(arr, pi, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            // Se o elemento atual for menor que o pivô
            if (arr[j] < arr[high]) {
                i++;
                swap(arr, i, j);
            }
        }

        // O pivô é colocado na posição correta
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap ( int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[] numerosForQuicksort = null;

        try {
            // Leitura do arquivo
            BufferedReader br = new BufferedReader(new FileReader("/Users/pedronaves/Downloads/dados500_mil.txt"));
            String linha = br.readLine();

            // Remover colchetes e dividir a linha em números
            if (linha != null) {
                String[] numerosStr = linha.replaceAll("\\[|\\]", "").split(",\\s*");

                long inicioExecucao = System.currentTimeMillis();

                // Converter e armazenar cada número para o QuickSort
                numerosForQuicksort = Arrays.stream(numerosStr)
                        .map(String::trim)
                        .mapToInt(Integer::parseInt)
                        .toArray();

                quicksort(numerosForQuicksort, 0, numerosForQuicksort.length - 1);

                long fimExecucao = System.currentTimeMillis();

                for (int i = 0; i < numerosForQuicksort.length; i++) {
                    System.out.print(" " + numerosForQuicksort[i]);
                }

                System.out.println("\nTempo total para ordenação " + (fimExecucao - inicioExecucao) + " milissegundos");

            }
            // Fechar o BufferedReader
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}