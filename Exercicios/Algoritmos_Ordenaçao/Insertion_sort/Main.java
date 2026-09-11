import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
    int[] numeros= new int[10];
    int n= numeros.length;
    Random rand= new Random();
    for(int x=0; x<n;x++){
        numeros[x]=rand.nextInt(100);
    }
    System.out.println("------------Vetor Original------------");
    System.out.println(Arrays.toString(numeros));
    Insertion ins= new Insertion();
    System.out.println("-----------Vetor Ordenado------------");
    ins.calcular(numeros);

}
}