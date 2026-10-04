import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int tam=0;
        Scanner scan= new Scanner(System.in);
        Random rand= new Random();

        System.out.printl("------------------Atividade I------------------");
        System.out.println("Digite o tamanho do vetor para ordenar:");
        System.out.println("-----------------------------------------------");

        tam=scan.nextInt();
        int[]vetor= new int[tam];
        Merge merge= new Merge(vetor);
        Quick quick= new Quick(vetor);
        Heap heap= new Heap(vetor);
        Counting counting= new Counting(vetor);
        Radix radix= new Radix(vetor);
        Bucket bucket= new Bucket(vetor);
        Bubble bubble= new Bubble(vetor);
        Insertion insertion= new Insertion(vetor);
        Selection selection= new Selection(vetor);
        Shell shell= new Shell(vetor);

        int op=0;

        System.out.println("----------------Algoritmos-------------------");
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



    }
}