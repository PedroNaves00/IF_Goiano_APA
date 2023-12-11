import java.util.Arrays;
import java.util.Random;

public class QuickSortComPivoAleatorio {

    public static void main(String[] args) {
        // Gera uma lista aleatória de 0 a 100 mil números
        int tamanhoLista = 500000;
        int[] lista = gerarListaAleatoria(tamanhoLista);

        System.out.println("Lista original:");
        // Mostra os primeiros 10 elementos da lista original
        exibirElementos(lista, 10);

        long inicio = System.currentTimeMillis();

        // Executa o QuickSort com pivô aleatório
        quickSort(lista, 0, tamanhoLista - 1);

        long fim = System.currentTimeMillis();

        System.out.println("\nLista ordenada com QuickSort:");
        // Mostra os primeiros 10 elementos da lista ordenada
        exibirElementos(lista, 10);

        long tempoExecucao = fim - inicio;

        System.out.println("\nTempo de execução: "+ (tempoExecucao / 1000.0) + " segundos");
    }

    // Função para gerar uma lista aleatória de 0 a 100 mil números
    private static int[] gerarListaAleatoria(int tamanho) {
        int[] lista = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista[i] = random.nextInt(100001); // Números de 0 a 100 mil
        }
        return lista;
    }

    // Função para exibir os primeiros n elementos de uma lista
    private static void exibirElementos(int[] lista, int n) {
        for (int i = 0; i < Math.min(n, lista.length); i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    // Implementação do algoritmo QuickSort com pivô aleatório
    private static void quickSort(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            // Escolhe um pivô aleatório
            int indicePivo = escolherPivoAleatorio(inicio, fim, lista);
            // Particiona a lista e obtém a posição final do pivô
            int posicaoPivo = particionar(lista, inicio, fim, indicePivo);

            // Recursivamente ordena as sublistas à esquerda e à direita do pivô
            quickSort(lista, inicio, posicaoPivo - 1);
            quickSort(lista, posicaoPivo + 1, fim);
        }
    }

    // Função para escolher um pivô aleatório dentro de um intervalo
    private static int escolherPivoAleatorio(int inicio, int fim, int[] lista) {
        Random random = new Random();
        return random.nextInt(fim - inicio + 1) + inicio;
    }

    // Função para particionar a lista em torno do pivô
    private static int particionar(int[] lista, int inicio, int fim, int indicePivo) {
        // Troca o pivô para o final da lista
        int temp = lista[indicePivo];
        lista[indicePivo] = lista[fim];
        lista[fim] = temp;

        // Realiza o particionamento
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (lista[j] <= lista[fim]) {
                i++;
                // Troca lista[i] e lista[j]
                temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }

        // Troca lista[i+1] e lista[fim]
        temp = lista[i + 1];
        lista[i + 1] = lista[fim];
        lista[fim] = temp;

        // Retorna a posição final do pivô
        return i + 1;
    }
}
