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


    }
}