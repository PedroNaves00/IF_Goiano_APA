## IF_Goiano_APA

##Escolha da mediana como pivô
A escolha do pivô é um fator importante para o desempenho do quicksort. No caso do quicksort tradicional, o pivô é escolhido aleatoriamente. Isso pode levar a um pior caso no qual o vetor já está ordenado, resultando em um tempo de execução O(n^2).

A escolha da mediana como pivô reduz a probabilidade de ocorrer o pior caso. Isso ocorre porque a mediana é um elemento central do vetor, e é menos provável que o vetor já esteja ordenado em torno da mediana.

No código fornecido, a escolha da mediana é feita na função partition(). A função primeiro troca o pivô com o elemento da posição central do vetor. Em seguida, a função itera sobre o vetor, movendo todos os elementos menores que o pivô para a metade esquerda do vetor. O pivô é então colocado na posição correta, dividindo o vetor em duas metades.

Complexidade de tempo

A escolha da mediana não afeta a complexidade de tempo do quicksort. O caso médio e o melhor caso permanecem O(n log n), e o pior caso é reduzido para O(n^(2/3)).
