import java.util.Arrays;
import java.util.Random;

public class QuickSortComPivoPrimeUltimo {

    public static void main(String[] args) {
        // Gerar uma lista aleatória de 0 a 100 mil números
        int tamanhoLista = 500000;
        int[] lista = gerarListaAleatoria(tamanhoLista);

        // Mostrar os primeiros 10 elementos antes da ordenação
        System.out.println("Lista antes da ordenação: " + Arrays.toString(Arrays.copyOfRange(lista, 0, 10)));

        // Medir o tempo de execução do QuickSort
        long inicio = System.currentTimeMillis();
        quickSort(lista, 0, lista.length - 1);
        long fim = System.currentTimeMillis();

        // Mostrar os primeiros 10 elementos após a ordenação
        System.out.println("Lista após a ordenação: " + Arrays.toString(Arrays.copyOfRange(lista, 0, 10)));

        // Calcular e exibir o tempo gasto em segundos
        double tempoGasto = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto para ordenar: " + tempoGasto + " segundos");
    }

    // Método para gerar uma lista aleatória de 0 a 100 mil números
    private static int[] gerarListaAleatoria(int tamanho) {
        int[] lista = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista[i] = random.nextInt(100001);
        }
        return lista;
    }

    // Método para realizar o QuickSort com pivôs sendo o primeiro e o último elemento
    private static void quickSort(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(lista, inicio, fim);
            quickSort(lista, inicio, indicePivo - 1);
            quickSort(lista, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] lista, int inicio, int fim) {
        int pivo = lista[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (lista[j] <= pivo) {
                i++;
                trocarElementos(lista, i, j);
            }
        }

        trocarElementos(lista, i + 1, fim);
        return i + 1;
    }

    private static void trocarElementos(int[] lista, int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
}
