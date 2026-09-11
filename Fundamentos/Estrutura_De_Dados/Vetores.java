import java.util.Arrays;
import java.util.Random;

public class Vetores {
    public static void main(String [] args) {


        int[] vet_num = new int[10];
        int n = vet_num.length;
        Random rand = new Random();
        for (int x = 0; x < n; x++) {
            vet_num[x] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(vet_num));
    }
}


