import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int X = 1000;

        Random rand = new Random();
        LinkedList<Numero> Lista_ligada = new LinkedList<>();

        for (int x = 0; x < X; x++) {
            int numero = rand.nextInt(X);
            Lista_ligada.add(new Numero(numero));
        }

        for (int z = 0; z < X; z++) {
            System.out.println("["+Lista_ligada.get(z).getNumero()+"],");
        }
    }
}