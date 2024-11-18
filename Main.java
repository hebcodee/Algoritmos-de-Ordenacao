import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        OrdenacaoLinear ordenacaoLinear = new OrdenacaoLinear();
        OrdenacaoDivisaoConquista ordenacaoDivisaoConquista = new OrdenacaoDivisaoConquista();

        int[] vetor10k = new int[10000];
        int[] vetor50k = new int[50000];
        int[] vetor100k = new int[100000];
        int tamanho10k = vetor10k.length;
        int tamanho50k = vetor50k.length;
        int tamanho100k = vetor100k.length;

        //Preenche Vetor de 10k
        for (int i = 0; i < 10000; i++) {
            vetor10k[i] = random.nextInt(100); // Gera números entre 0 e 99
        }
        //Preenche Vetor de 50k
        for (int i = 0; i < 50000; i++) {
            vetor50k[i] = random.nextInt(100); // Gera números entre 0 e 99
        }
        //Preenche Vetor de 100k
        for (int i = 0; i < 100000; i++) {
            vetor100k[i] = random.nextInt(100); // Gera números entre 0 e 99
        }



        //----------InsertionSort
        //ordenacaoLinear.insertionSort(vetor10k);
        //ordenacaoLinear.printArray(vetor10k);

        //ordenacaoLinear.insertionSort(vetor50k);
        //ordenacaoLinear.printArray(vetor50k);

        //ordenacaoLinear.insertionSort(vetor100k);
        //ordenacaoLinear.printArray(vetor100k);


        //----------SelectionSort
        //ordenacaoLinear.selectionSort(vetor10k);
        //ordenacaoLinear.printArray(vetor10k);

        //ordenacaoLinear.selectionSort(vetor50k);
        //ordenacaoLinear.printArray(vetor50k);

        //ordenacaoLinear.selectionSort(vetor100k);
        //ordenacaoLinear.printArray(vetor100k);


        //----------BubbleSort
        //ordenacaoLinear.bubbleSort(vetor10k, tamanho10k);
        //ordenacaoLinear.printArray(vetor10k);

        //ordenacaoLinear.bubbleSort(vetor50k, tamanho50k);
        //ordenacaoLinear.printArray(vetor50k);

        //ordenacaoLinear.bubbleSort(vetor100k, tamanho100k);
        //ordenacaoLinear.printArray(vetor100k);


        //----------CountingSort
        //int[] CountSort = OrdenacaoLinear.countSort(vetor10k);
        //ordenacaoLinear.printArray(CountSort);

        //int[] CountSort = OrdenacaoLinear.countSort(vetor50k);
        //ordenacaoLinear.printArray(CountSort);

        //int[] CountSort = OrdenacaoLinear.countSort(vetor100k);
        //ordenacaoLinear.printArray(CountSort);


        //----------MergeSort
        //ordenacaoDivisaoConquista.mergeSort(vetor10k, 0, tamanho10k-1);
        //ordenacaoDivisaoConquista.printArray(vetor10k);

        //ordenacaoDivisaoConquista.mergeSort(vetor50k, 0, tamanho50k-1);
        //ordenacaoDivisaoConquista.printArray(vetor50k);

        //ordenacaoDivisaoConquista.mergeSort(vetor100k, 0, tamanho100k-1);
        //ordenacaoDivisaoConquista.printArray(vetor100k);


        //----------QuickSort
        //ordenacaoDivisaoConquista.quickSort(vetor10k, 0, tamanho10k-1);
        //ordenacaoDivisaoConquista.printArray(vetor10k);

        //ordenacaoDivisaoConquista.quickSort(vetor50k, 0, tamanho50k-1);
        //ordenacaoDivisaoConquista.printArray(vetor50k);

        //ordenacaoDivisaoConquista.quickSort(vetor100k, 0, tamanho100k-1);
        //ordenacaoDivisaoConquista.printArray(vetor100k);


    }
}