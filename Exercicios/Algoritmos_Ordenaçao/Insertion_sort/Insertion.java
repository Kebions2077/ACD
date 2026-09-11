import java.util.Arrays;
public class Insertion {
    public void calcular( int[] arr){
        for(int i=1; i<arr.length;i++){
            int chave= arr[i];
            int j= i-1;

            while(j>=0 && arr[j]>chave){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=chave;
        }
        System.out.println(Arrays.toString(arr));
    }
}
