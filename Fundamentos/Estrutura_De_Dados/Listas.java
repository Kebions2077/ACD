import java.util.LinkedList;
import java.util.Random;
public class Listas {
    public static void main(String[] args){
        LinkedList<Integer> lista_num= new LinkedList<>();
        Random rand= new Random();

        for(int x=0;x<10;x++){
            int temp=rand.nextInt(100);
            lista_num.add(temp);
        }
        System.out.println("-----------Lista-----------");
        System.out.println(lista_num);

    }
}
