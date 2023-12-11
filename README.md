## IF_Goiano_APA

## QuickSortMediana: Ordenação eficiente com mediana como pivô

**QuickSortMediana** é uma implementação do algoritmo de ordenação QuickSort que utiliza a mediana como pivô. Esta escolha de pivô melhora a performance do algoritmo em comparação com a escolha aleatória, especialmente em casos adversos.

### Documentação

#### Funcionalidades

- Ordenação de arrays de inteiros utilizando o algoritmo QuickSort.
- Escolha do pivô como a mediana do subvetor a ser particionado.
- Leitura de dados de um arquivo de texto para facilitar testes.

#### Estrutura do código

- **Classe QuickSortMediana:**
    - Método `quicksort(int[] arr, int low, int high)`: Implementa o algoritmo QuickSort recursivamente.
    - Método `partition(int[] arr, int low, int high, int pi)`: Particiona o subvetor em torno do pivô escolhido (mediana).
    - Método `swap(int[] arr, int i, int j)`: Troca os valores de dois elementos do array.
    - Método `main(String[] args)`: Leitura de dados do arquivo, execução do QuickSort e impressão dos resultados.

#### Fluxo do programa

1. O programa lê os dados de um arquivo de texto e converte os valores para um array de inteiros.
2. O método `quicksort` é chamado para ordenar o array recursivamente.
3. O método `partition` é utilizado para dividir o subvetor em duas partes: elementos menores que o pivô e elementos maiores que o pivô.
4. A mediana é calculada como o elemento central do subvetor e utilizada como pivô.
5. O processo de ordenação é repetido recursivamente para cada subvetor.
6. Ao final, o array ordenado é impresso na tela, juntamente com o tempo de execução do algoritmo.

#### Vantagens da escolha da mediana como pivô

- Reduz a probabilidade de cair no pior caso do QuickSort, onde a complexidade temporal é O(n^2).
- Melhora a performance do algoritmo em comparação com a escolha aleatória do pivô, especialmente para arrays não aleatórios.

#### Limitações

- Embora a escolha da mediana seja uma boa estratégia, ainda existem casos em que o QuickSort pode apresentar performance O(n^2).

#### Instruções de uso

Para utilizar o código, salve o arquivo em um projeto Java e execute a classe `QuickSortMediana`. Certifique-se de que o arquivo de dados "dados500_mil.txt" está no caminho especificado no código.

#### Considerações finais

O QuickSortMediana é uma implementação eficiente do algoritmo QuickSort que utiliza a mediana como pivô. Esta escolha melhora a performance do algoritmo em comparação com a escolha aleatória, especialmente em casos adversos. O código é bem estruturado e comentado, facilitando a compreensão e o uso.


