import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tam = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("------------------Atividade I------------------");
        System.out.println("Digite o tamanho do vetor para ordenar:");
        System.out.println("-----------------------------------------------");
        tam = scan.nextInt();

        Integer[] vetor = new Integer[tam];

        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = rand.nextInt(1000);
        }

        int op = -1;

        while (op != 0) {
            System.out.println("----------------Algoritmos-------------------");
            System.out.println("0)Sair");
            System.out.println("1)Merge");
            System.out.println("2)Quick");
            System.out.println("3)Heap");
            System.out.println("4)Counting");
            System.out.println("5)Radix");
            System.out.println("6)Bucket");
            System.out.println("7)Bubble");
            System.out.println("8)Insertion");
            System.out.println("9)Selection");
            System.out.println("10) Shell");
            System.out.println("-----------------------------------------------");
            System.out.println("Digite o Algoritmo para realizar a ordenaçao:");
            System.out.println("-----------------------------------------------");
            op = scan.nextInt();


            Integer[] copia = vetor.clone();

            long inicio = System.nanoTime();

            switch (op) {

                case 0:
                    break;

                case 1:
                    System.out.println("----------MergeSort----------");
                    Merge merge = new Merge(copia);
                    break;

                case 2:
                    System.out.println("QuickSort");
                    Quick quick = new Quick(copia);
                    break;

                case 3:
                    System.out.println("HeapSort");
                    Heap heap = new Heap(copia);
                    break;

                case 4:
                    System.out.println("Counting");
                    Counting counting = new Counting(copia);
                    break;

                case 5:
                    System.out.println("Radix");
                    Radix radix = new Radix(copia);
                    break;

                case 6:
                    System.out.println("BucketSort");
                    Bucket bucket = new Bucket(copia);
                    break;

                case 7:
                    System.out.println("Bubblesort");
                    Bubble bubble = new Bubble(copia);
                    break;

                case 8:
                    System.out.println("Insertion");
                    Insertion insertion = new Insertion(copia);
                    break;

                case 9:
                    System.out.println("Selection");
                    Selection selection = new Selection(copia);
                    break;

                case 10:
                    System.out.println("Shell");
                    Shell shell = new Shell(copia);
                    break;

                default:
                    System.out.println("Opçao invalida");
                    continue;
            }

            long fim = System.nanoTime();
            System.out.printf("Tempo: %.3f ms%n", (fim - inicio) / 1_000_000.0);
            System.out.println();
        }

        scan.close();
    }
}