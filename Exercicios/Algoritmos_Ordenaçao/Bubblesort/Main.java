import java.util.Random;

public class Main{
    public static void main(String[] args){

        final int TAM_VET= 10;
        final int ALEATORIO= 5;

        int []vetor= new int[TAM_VET];
        Random rand= new Random(ALEATORIO);

        for(int y=0;y<TAM_VET;y++){
            vetor[y]= rand.nextInt(100);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Antes:"+ java.util.Arrays.toString(vetor));
        System.out.println("-----------------------------------------");
       Bubblesort.bubblesort(vetor);
        System.out.println("-----------------------------------------");
        System.out.println("Depois:"+ java.util.Arrays.toString(vetor));
        System.out.println("-----------------------------------------");

    }
}